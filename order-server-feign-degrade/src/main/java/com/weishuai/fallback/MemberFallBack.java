package com.weishuai.fallback;

import com.weishuai.service.MemberFeignDegrade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WS on 2018/10/5.
 */
@Component
public class MemberFallBack implements MemberFeignDegrade {
    @Override
    public List<String> getToOrderMemberAll() {
        //服务的降级处理
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("服务发生异常。。。");
        return listStr;
    }
}
