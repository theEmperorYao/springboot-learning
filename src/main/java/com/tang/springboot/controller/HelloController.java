package com.tang.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2022/3/19 9:20 下午
 * @Author by tangyao
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World"+"你好";
    }

}
