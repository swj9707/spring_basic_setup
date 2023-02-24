package com.swj9707.test_api.v1.user.service.inter;

import com.swj9707.test_api.v1.user.dto.UserReq;
import com.swj9707.test_api.v1.user.dto.UserRes;

import java.util.UUID;

public interface UserService {
    UserRes.CreateUserRes createUser(UserReq.CreateUser request);
    UserRes.UserInfoRes getUserInfo(UUID userId);
}
