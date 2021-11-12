package com.example.demo3.controller;

import com.example.demo3.config.AliPayConfig;
import com.example.demo3.config.WxPayConfig;
import com.example.demo3.util.JSONData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @package: com.example.demo3.controller
 * @ClassName: TestController
 * @author: james
 * @date: 2021-07-26 22:54
 * @version: V1.0.1
 * @description: Created with IntelliJ IDEA
 */
@RestController
@RequestMapping("api/v1/pub/test")
@PropertySource(value = "classpath:pay.properties")
public class TestController {

    @Value("${wxpay.appId}")
    private String wxAppId;
    @Value("${wxpay.secret}")
    private String wxSecret;
    @Value("${wxpay.mechid}")
    private String wxMechId;
    @Value("${alipay.appId}")
    private String aliAppId;
    @Value("${alipay.secret}")
    private String aliSecret;
    @Value("${alipay.mechid}")
    private String aliMechId;
    @Autowired
    private WxPayConfig wxPayConfig;
    @Autowired
    private AliPayConfig aliPayConfig;

    @RequestMapping("getConfig")
    public JSONData getConfig(){
        Map<String, String> map = new HashMap<>();
        map.put("wxAppId", wxPayConfig.getWxAppId());
        map.put("wxSecret", wxPayConfig.getWxSecret());
        map.put("wxMechId", wxPayConfig.getWxMechId());
        map.put("aliAppId", aliPayConfig.getAliAppId());
        map.put("aliSecret", aliPayConfig.getAliSecret());
        map.put("aliMechId", aliPayConfig.getAliMechId());
        return JSONData.buildSuccess(map);
    }

    @RequestMapping("extTest")
    public JSONData extTest(){

        int i = 1 / 0;
        return JSONData.buildSuccess();
    }
}
