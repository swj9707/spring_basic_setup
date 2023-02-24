package com.swj9707.test_api.v1.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

public class UserDTO {
    private UserDTO() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserInfo {
        private UUID userId;
        private String userName;
        private String userEmail;
        private String userPassword;
    }
}
