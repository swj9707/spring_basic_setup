package com.swj9707.test_api.v1.user.model.repository;

import com.swj9707.test_api.v1.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
