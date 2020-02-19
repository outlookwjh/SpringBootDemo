package com.huawei.demo.controller;

import com.huawei.demo.cfg.SpringCfg;
import com.huawei.demo.cfg.SpringCfg0;
import com.huawei.demo.cfg.SpringCfg1;
import com.huawei.demo.cfg.SpringCfg2;
import com.huawei.demo.util.PropertiesListenr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 定义一个ApplicationListener<ApplicationStartedEvent> 接口的实现类，
 * 配合使用PropertiesLoaderUtils。loadAllProperties方法实现在启动时获取
 * 配置，该配置获取接口为propterties格式（map）,k-v形式的值可直接获取，其他类型的需要处理
 */
@Controller
public class SpringbootTestController2 {

    @Autowired
    PropertiesListenr listenr;

    @RequestMapping("/getVlue2")
    @ResponseBody
    public String printEnv()
    {
        Properties properties = listenr.getProperties();
        return null;

    }


}
