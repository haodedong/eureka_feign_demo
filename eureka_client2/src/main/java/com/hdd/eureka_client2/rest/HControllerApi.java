package com.hdd.eureka_client2.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 项目名称
 *
 * @author bill.hao
 * @create 2018/9/4 下午 8:10
 */
@Component
@FeignClient("eureka.client1")
public interface HControllerApi {
    @PostMapping(value = "sayHello")
    public  String sayHello(@RequestParam String t);
}
