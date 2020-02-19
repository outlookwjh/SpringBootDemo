package com.huawei.demo.controller;

import com.huawei.demo.cfg.SpringCfg3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 通过@Configuration
 @PropertySources(@PropertySource("classpath:config/customapp.yml"))
 @ConfigurationProperties(prefix = "pepoles") 三个注解，自定义配置文件路经
 */
@Controller
public class SpringbootTestController4 {

    @Autowired
    SpringCfg3 cfg3;

    @RequestMapping("/getVlue4")
    @ResponseBody
    public String printEnv()
    {
        Map<String, String> ps = cfg3.getPs();
        return null;

    }


}
