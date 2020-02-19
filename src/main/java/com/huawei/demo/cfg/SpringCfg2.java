package com.huawei.demo.cfg;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "pepoles")
public class SpringCfg2 {

    private List<String> pepole;

    public List<String> getPepole() {
        return pepole;
    }

    public void setPepole(List<String> pepole) {
        this.pepole = pepole;
    }
}
