package com.huawei.demo.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Configuration
@PropertySources(@PropertySource("classpath:config/customapp.yml"))
@ConfigurationProperties(prefix = "pp")
public class SpringCfg3 {

    @Value("${right}")
    private String right;

    private Map<String,String> ps;

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public Map<String, String> getPs() {
        return ps;
    }

    public void setPs(Map<String, String> ps) {
        this.ps = ps;
    }
}
