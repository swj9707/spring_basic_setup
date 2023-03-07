package com.swj9707.test_api.v1.user.service;

import com.swj9707.test_api.global.enums.CustomError;
import com.swj9707.test_api.global.error.CustomException;
import com.swj9707.test_api.v1.user.dto.UserReq;
import com.swj9707.test_api.v1.user.dto.UserRes;
import com.swj9707.test_api.v1.user.model.ServiceUser;
import com.swj9707.test_api.v1.user.model.repository.ServiceUserRepository;
import com.swj9707.test_api.v1.user.service.inter.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final ServiceUserRepository userRepository;

    @Override
    public UserRes.CreateUserRes createUser(UserReq.CreateUser request) {
        ServiceUser serviceUser = ServiceUser.createUser(request);
        userRepository.save(serviceUser);

        return new UserRes.CreateUserRes(serviceUser.getUserId());
    }

    @Override
    public UserRes.UserInfoRes getUserInfo(UUID userId) {
        ServiceUser serviceUser = userRepository.findById(userId)
                .orElseThrow(() -> new CustomException(CustomError.USER_NOT_FOUND));
        return UserRes.UserInfoRes.fromEntity(serviceUser);
    }
}
