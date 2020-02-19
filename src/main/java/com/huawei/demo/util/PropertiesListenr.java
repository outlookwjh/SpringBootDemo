package com.huawei.demo.util;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;
@Component
public class PropertiesListenr implements ApplicationListener<ApplicationStartedEvent>{

    Properties properties;
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        try {
             properties = PropertiesLoaderUtils.loadAllProperties("application.yml");
            System.out.println(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties getProperties() {
        return properties;
    }
}
