package com.hdd.eureka_client1.controller;

import com.hdd.eureka_client1.rest.HelloApi;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称
 *
 * @author bill.hao
 * @create 2018/9/3 下午 7:21
 */
@RestController
public class HelloController implements HelloApi {

    @Override
    public String sayHello(@RequestParam String t) {
        return t+"2333333";
    }
}
