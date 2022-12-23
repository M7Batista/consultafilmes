package com.michaelbatista.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseApi {
    public String getValue(String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = BaseApi.class.getResourceAsStream("/main.properties");
        properties.load(inputStream);
        return properties.getProperty(key);
    }
}
