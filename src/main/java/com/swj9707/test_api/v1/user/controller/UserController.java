package com.swj9707.test_api.v1.user.controller;

import com.swj9707.test_api.global.common.BaseRes;
import com.swj9707.test_api.v1.user.dto.UserReq;
import com.swj9707.test_api.v1.user.dto.UserRes;
import com.swj9707.test_api.v1.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping("/create")
    public ResponseEntity<BaseRes<UserRes.CreateUserRes>> createUser(@RequestBody UserReq.CreateUser request) {
        UserRes.CreateUserRes res = userService.createUser(request);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }

    @GetMapping("/userInfo")
    public ResponseEntity<BaseRes<UserRes.UserInfoRes>> getUserInfo(@RequestParam(name = "userId", defaultValue = "") UUID userId) {
        UserRes.UserInfoRes res = userService.getUserInfo(userId);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }


}
