package com.example.demo3.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @package: com.example.demo3.config
 * @ClassName: WxPayConfig
 * @author: james
 * @date: 2021-07-26 23:09
 * @version: V1.0.1
 * @description: Created with IntelliJ IDEA
 */
@Configuration
@PropertySource(value = "classpath:pay.properties")
@Data
public class WxPayConfig {
    @Value("${wxpay.appId}")
    private String wxAppId;
    @Value("${wxpay.secret}")
    private String wxSecret;
    @Value("${wxpay.mechid}")
    private String wxMechId;
}
