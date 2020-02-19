package com.huawei.demo.controller;

import com.huawei.demo.util.PropertiesListenr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;


@Controller
public class SpringbootTestController3 {


    @Autowired
    private Environment env;

    @RequestMapping("/getVlue3")
    @ResponseBody
    public String printEnv()
    {
        String person = env.getProperty("person");
        return null;

    }


}
