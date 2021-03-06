package com.weishuai.service;

import com.weishuai.fallback.MemberFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by WS on 2018/10/4.
 */
@FeignClient(value = "service-member-second", fallback = MemberFallBack.class)
public interface MemberFeignDegrade {

    @GetMapping(value = "/getMemberAll")
    List<String> getToOrderMemberAll();
}
