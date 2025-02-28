package com.sparta.grouptest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {
    @GetMapping("api/test")
    public String test() { return "레파지토리 연결"; }

    @GetMapping("api/test3")
    public String test3() { return "test3: 충돌 발생"; }
}
