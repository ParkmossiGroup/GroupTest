package com.sparta.grouptest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {
    @GetMapping("api/test")
    public String test() { return "레파지토리 연결"; }

    @GetMapping("api/test1")
    public String test1() { return "test1: 로컬 dev환경에서 작업"; }

    @GetMapping("api/test2")
    public String test2() { return "test2: PR확인해보기"; }
}
