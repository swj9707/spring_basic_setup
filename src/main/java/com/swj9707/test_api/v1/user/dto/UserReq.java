package com.swj9707.test_api.v1.user.dto;

import lombok.*;

public class UserReq {
    private UserReq() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateUser {
        private String userName;
        private String userEmail;
        private String userPassword;
    }
}
