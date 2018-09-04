package com.hdd.eureka_client1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * api接口
 *
 * @author bill.hao
 * @create 2018/9/3 下午 4:19
 */

public interface HelloApi {
    @PostMapping(value = "sayHello")
    public  String sayHello(@RequestParam String t);
}
