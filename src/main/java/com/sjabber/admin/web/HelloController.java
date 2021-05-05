package com.sjabber.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Note JSON 을 반환하는 컨트롤러로 만든다.
public class HelloController {

    @GetMapping("/hello") //Note HTTP Method인 Get 요청을 받을 수 있는 API를 만든다.
    public String hello() {
        return "hello";

    }
}
