package com.weishuai.controller;

import com.weishuai.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by WS on 2018/10/4.
 */
@RestController
public class OrderFeignController {

    @Autowired
    private MemberFeign memberFeign;

    @GetMapping(value = "/getToOrderMemberAll")
    public List<String> getToOrderMemberAll(){
        return memberFeign.getToOrderMemberAll() ;
    }
}
