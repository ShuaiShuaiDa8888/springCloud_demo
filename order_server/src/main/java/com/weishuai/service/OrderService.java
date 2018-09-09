package com.weishuai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * Created by WS on 2018/9/9.
 */
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderUserAll(){
        List object = restTemplate.getForObject("http://service-member/getMemberAll", List.class);
        return object;
    }
}
