package com.shang.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
