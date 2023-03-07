package com.swj9707.test_api.v1.user.model;

import com.swj9707.test_api.global.entity.BaseTimeEntity;
import com.swj9707.test_api.v1.user.dto.UserReq;
import com.swj9707.test_api.v1.user.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Entity
@Table(name = "user")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceUser extends BaseTimeEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    private UUID userId = UUID.randomUUID();
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_password")
    private String password;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;


    public static ServiceUser createUser(UserReq.CreateUser dto) {
        return ServiceUser.builder()
                .userName(dto.getUserName())
                .userEmail(dto.getUserEmail())
                .password(dto.getUserPassword())
                .build();
    }

}
