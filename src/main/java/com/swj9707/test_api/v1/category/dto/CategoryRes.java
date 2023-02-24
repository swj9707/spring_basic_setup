package com.swj9707.test_api.v1.category.dto;

import com.swj9707.test_api.v1.category.model.Category;
import lombok.*;

public class CategoryRes {
    private CategoryRes() {}
    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AddCategoryRes {
        private Long id;
        private String name;
        private String type;

        public static AddCategoryRes fromEntity(Category category) {
            return AddCategoryRes.builder()
                    .id(category.getId())
                    .name(category.getName())
                    .type(category.getType())
                    .build();
        }
    }

}
