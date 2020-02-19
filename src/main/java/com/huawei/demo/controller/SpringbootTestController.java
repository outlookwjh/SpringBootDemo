package com.huawei.demo.controller;

import com.huawei.demo.cfg.SpringCfg;
import com.huawei.demo.cfg.SpringCfg1;
import com.huawei.demo.cfg.SpringCfg2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 读取配置文件的方式一： 使用@value注解，该注解可以读取k-v类型，map类型，不能读取list类型
 */
@Controller
public class SpringbootTestController {

    /**
     * 测试获取yml文件配置的值
     */
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private String age;


    @RequestMapping("/getVlue")
    @ResponseBody
    public String printEnv()
    {

        System.out.println("name: "+name);
        System.out.println("age: "+age);

        return this.name;

    }


}
