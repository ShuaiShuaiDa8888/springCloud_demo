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

    int count = 0;

    @GetMapping(value = "/getMemberAll")
    public List<String> getMemberAll() {
        count++;
        /* 配合feign-degrade和Hystrix实现服务降级 */
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> memberList = new ArrayList<>();
        memberList.add("zhangsan");
        memberList.add("Lisi");
        memberList.add("wangwu");
        memberList.add(String.valueOf(count));
        memberList.add("serverPort:" + serverPort);

        System.out.println(count);
        return memberList;
    }

    @GetMapping(value = "/getMemberServiceApi")
    public String getMemberApi() {
        return "this is member project";
    }
}
