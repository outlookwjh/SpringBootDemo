package com.huawei.demo.controller;

import com.huawei.demo.cfg.SpringCfg;
import com.huawei.demo.cfg.SpringCfg0;
import com.huawei.demo.cfg.SpringCfg1;
import com.huawei.demo.cfg.SpringCfg2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 读取配置文件的方式二： 定义一个配置类，使用@Component
 @ConfigurationProperties(prefix = "person")两个注解，
 在cfg文件夹下有四个配置类，
     cfg0是将配置文件中的配置，转换为map;
     cfg是对对象的处理;
     cfg1和cfg2是对list的处理，要注意cfg1和cfg2对list的处理区别
 */
@Controller
public class SpringbootTestController1 {

    @Autowired
    private SpringCfg cfg;

    @Autowired
    private SpringCfg1 cfg1;

    @Autowired
    private SpringCfg2 cfg2;

    @Autowired
    private SpringCfg0 cfg0;

    @RequestMapping("/getVlue1")
    @ResponseBody
    public String printEnv()
    {
        String name = cfg.getName();
        List<String> pepole = cfg1.getPepole();
        List<String> pepole1 = cfg2.getPepole();
        Map<String, String> person = cfg0.getPerson();
        return name;

    }


}
