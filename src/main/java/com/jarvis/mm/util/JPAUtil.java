package com.jarvis.mm.util;

import com.jarvis.mm.config.DbConfig;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class JPAUtil {
    private static EntityManagerFactory entityManagerFactory;

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static void createEntityManagerFactory(DbConfig dbConfig) {
        Map<String, String> jpaProps = new HashMap<>();
//        Configuring JDBC properties
        jpaProps.put("javax.persistence.jdbc.url", dbConfig.getUrl());
        jpaProps.put("javax.persistence.jdbc.user", dbConfig.getUser());
        jpaProps.put("javax.persistence.jdbc.password", dbConfig.getPassword());
        jpaProps.put("javax.persistence.jdbc.driver", dbConfig.getDriverClass());

        Map<String, String> properties = dbConfig.getProperties();
        for(Map.Entry<String, String> entry : properties.entrySet()) {
            jpaProps.put(entry.getKey(), entry.getValue());
        }
        log.info("JPA props -> {}", jpaProps);

        entityManagerFactory = Persistence.createEntityManagerFactory("meet-up", jpaProps);
    }

}
