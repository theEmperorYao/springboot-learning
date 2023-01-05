package com.tang.springboot.controller;

import com.tang.springboot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2022/3/19 9:20 下午
 * @Author by tangyao
 */
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car() {
        return car;
    }


    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello World" + name;
    }

}
