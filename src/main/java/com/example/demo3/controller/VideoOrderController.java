package com.example.demo3.controller;

import com.example.demo3.util.JSONData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package: com.example.demo3.controller
 * @ClassName: VideoOrderController
 * @author: james
 * @date: 2021-07-28 20:33
 * @version: V1.0.1
 * @description: Created with IntelliJ IDEA
 */
@RestController
@RequestMapping("api/v1/pri/order")
public class VideoOrderController {
    @GetMapping("save")
    public JSONData save(){

        return JSONData.buildSuccess("订单下单成功");
    }
}
