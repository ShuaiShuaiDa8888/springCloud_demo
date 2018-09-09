package com.weishuai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WS on 2018/9/9.
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/getMemberAll")
    public List<String> getMemberAll(){
        List<String> memberList = new ArrayList<>();
        memberList.add("zhangsan");
        memberList.add("Lisi");
        memberList.add("wangwu");
        memberList.add("serverPort:" + serverPort);

        return memberList;
    }

    @GetMapping(value = "/getMemberServiceApi")
    public String getMemberApi(){
        return "this is member project";
    }
}
