package com.jarvis.mm.health;

import com.codahale.metrics.health.HealthCheck;
import com.jarvis.mm.QuinkConfiguration;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jafar.rizvi on 10/09/16.
 */
@Slf4j
public class DBHealthCheck extends HealthCheck {
    private QuinkConfiguration quinkConfiguration;

    public DBHealthCheck(QuinkConfiguration meetUpConfiguration) {
        this.quinkConfiguration = meetUpConfiguration;
    }

    @Override
    protected Result check() throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(quinkConfiguration.getDbConfig().getUrl(),
                    quinkConfiguration.getDbConfig().getUser(),
                    quinkConfiguration.getDbConfig().getPassword());
            log.info("DB is up.");
            return Result.healthy("DB status success");
        } catch (SQLException e) {
            log.info("DB is down.");
            return Result.unhealthy("DB status fail");
        } finally {
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException ignore) {
                    log.info("DB is down.");
                }
        }
    }
}
