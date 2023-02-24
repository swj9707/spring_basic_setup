package com.swj9707.test_api.v1.user.service;

import com.swj9707.test_api.global.enums.CustomError;
import com.swj9707.test_api.global.error.CustomException;
import com.swj9707.test_api.v1.user.dto.UserReq;
import com.swj9707.test_api.v1.user.dto.UserRes;
import com.swj9707.test_api.v1.user.model.User;
import com.swj9707.test_api.v1.user.model.repository.UserRepository;
import com.swj9707.test_api.v1.user.service.inter.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserRes.CreateUserRes createUser(UserReq.CreateUser request) {
        User user = User.createUser(request);
        userRepository.save(user);
        user.setUserId(UUID.randomUUID());

        return new UserRes.CreateUserRes(user.getUserId());
    }

    @Override
    public UserRes.UserInfoRes getUserInfo(UUID userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new CustomException(CustomError.USER_NOT_FOUND));
        return UserRes.UserInfoRes.fromEntity(user);
    }
}
