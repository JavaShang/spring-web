package com.shang.web.controller;

import com.shang.web.common.CommonResult;
import com.shang.web.common.JingDongObserver;
import com.shang.web.common.ProductList;
import com.shang.web.common.TianMaoObserver;
import com.shang.web.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        log.info("测试一下日志info");
        log.debug("测试一下日志debug");
        log.error("测试一下日志error");
        return "hello1";
    }

    @RequestMapping(value="/user")
    public User userInfo(){
        User user = new User();
        user.setAddress("beijing");
        user.setId(2);
        user.setName("shang");
        user.setCreateDate(new Date());
        return user;
    }

    @RequestMapping(value="/user1")
    public CommonResult<User> userInfo1(){
        User user = new User();
        user.setAddress("北京");
        user.setId(2);
        user.setName("shang");
        return new CommonResult("11223");
    }

    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        JingDongObserver jdObserver = new JingDongObserver();
        TianMaoObserver tmObserver = new TianMaoObserver();
        observable.addObserver(jdObserver);
        observable.addObserver(tmObserver);
        observable.addProduct("新增产品1");
    }
}
