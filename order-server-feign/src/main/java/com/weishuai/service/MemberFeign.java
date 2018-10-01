package com.weishuai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by WS on 2018/10/2.
 */
@FeignClient(value = "service-member")
public interface MemberFeign {

    @GetMapping(value = "/getMemberAll")
    List<String> getToOrderMemberAll();
}
