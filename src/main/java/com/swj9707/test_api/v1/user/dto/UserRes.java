package com.swj9707.test_api.v1.user.dto;

import com.swj9707.test_api.v1.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

public class UserRes {
    private UserRes() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateUserRes {
        private UUID userId;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserInfoRes {
        private UUID userId;
        private String userName;
        private String userEmail;

        public static UserInfoRes fromEntity(User user) {
            return UserInfoRes.builder()
                    .userId(user.getUserId())
                    .userName(user.getUserName())
                    .userEmail(user.getUserEmail())
                    .build();
        }
    }
}
