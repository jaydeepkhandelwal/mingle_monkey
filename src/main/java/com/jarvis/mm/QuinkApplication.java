package com.jarvis.mm;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.jarvis.mm.health.DBHealthCheck;
import com.jarvis.mm.util.JPAUtil;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
/**
 *
 * Created by jafar.rizvi on 09/09/16.
 */
public class QuinkApplication extends Application<QuinkConfiguration> {

    public static void main(String[] args) throws Exception {
        new QuinkApplication().run(args);
    }

    @Override
    public void run(QuinkConfiguration configuration, Environment environment) throws Exception {
        environment.getObjectMapper().setPropertyNamingStrategy
                (PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        JPAUtil.createEntityManagerFactory(configuration.getDbConfig());

        environment.healthChecks().register("DB_Check", new DBHealthCheck(configuration));
    }
}
