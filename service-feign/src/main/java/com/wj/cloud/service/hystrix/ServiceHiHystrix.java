package com.wj.cloud.service.hystrix;

import com.wj.cloud.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by WangJie on 2018/9/13.
 */
@Component
public class ServiceHiHystrix implements ServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name + "hystrix ";
    }
}
