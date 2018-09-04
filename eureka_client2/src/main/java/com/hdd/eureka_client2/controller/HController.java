package com.hdd.eureka_client2.controller;

import com.hdd.eureka_client2.rest.HControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称
 *
 * @author bill.hao
 * @create 2018/9/4 下午 8:13
 */
@RestController
public class HController {
    @Autowired
    private HControllerApi hController;
    @PostMapping("/say")
    public String dd( String dd){
        return hController.sayHello(dd);
    }
}
