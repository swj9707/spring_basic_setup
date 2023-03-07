package com.swj9707.test_api.v1.user.service;

import com.swj9707.test_api.global.enums.CustomError;
import com.swj9707.test_api.global.error.CustomException;
import com.swj9707.test_api.v1.user.model.ServiceUser;
import com.swj9707.test_api.v1.user.model.repository.ServiceUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final ServiceUserRepository serviceUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ServiceUser user = serviceUserRepository.findTestUserByUserEmail(username)
                .orElseThrow(() -> new CustomException(CustomError.USER_NOT_FOUND));

        return User.builder()
                .username(user.getUserName())
                .password(user.getPassword())
                .roles(user.getRole().toString())
                .build();
    }
}
