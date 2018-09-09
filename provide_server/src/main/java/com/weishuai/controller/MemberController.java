package com.weishuai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WS on 2018/9/9.
 */
@RestController
public class MemberController {

    @GetMapping(value = "/getMemberAll")
    public List<String> getMemberAll(){
        List<String> memberList = new ArrayList<>();
        memberList.add("zhangsan");
        memberList.add("Lisi");
        memberList.add("wangwu");

        return memberList;
    }
}
