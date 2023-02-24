package com.swj9707.test_api.v1.test.controller;

import com.swj9707.test_api.global.common.BaseRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @GetMapping("/Hello")
    public ResponseEntity<BaseRes<String>> hello() {
        return ResponseEntity.ok().body(BaseRes.success("Hello"));
    }
}
