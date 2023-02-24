package com.swj9707.test_api.v1.category.model;

import com.swj9707.test_api.global.entity.BaseEntity;
import com.swj9707.test_api.global.entity.BaseTimeEntity;
import com.swj9707.test_api.v1.category.dto.CategoryReq;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class Category extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;

    public static Category createCategory(CategoryReq.GenerateCategory req) {
        return Category.builder()
                .name(req.getName())
                .type(req.getType())
                .build();
    }

}
