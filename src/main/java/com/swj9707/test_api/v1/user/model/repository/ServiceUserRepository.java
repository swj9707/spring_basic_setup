package com.swj9707.test_api.v1.user.model.repository;

import com.swj9707.test_api.v1.user.model.ServiceUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ServiceUserRepository extends JpaRepository<ServiceUser, UUID> {
    Optional<ServiceUser> findTestUserByUserEmail(String userEmail);

}
