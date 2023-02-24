package com.swj9707.test_api.global.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/*
 * 생성 시간만 자동으로 저장 해 주는 BaseEntity
 * 이름 그대로 생성 된 시간만 자동으로 생성합니다.
 * */
@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
@Getter
@Setter
public class BaseImmutableEntity {
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createAt;
}