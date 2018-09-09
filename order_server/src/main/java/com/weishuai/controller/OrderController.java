package com.weishuai.controller;

import com.weishuai.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by WS on 2018/9/9.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getOrderUserAll")
    public List<String> getOrderUserAll(){
        System.out.println("开始调用会员服务");
        List<String> orderUserAll = orderService.getOrderUserAll();
        return orderUserAll;
    }
}
