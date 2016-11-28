package com.jarvis.mm.config;

import java.util.Map;

import lombok.Data;

/**
 *
 * Created by jafar.rizvi on 10/09/16.
 */
@Data
public class DbConfig {
    private String driverClass;
    private String user;
    private String password;
    private String url;
    private Map<String, String> properties;
}