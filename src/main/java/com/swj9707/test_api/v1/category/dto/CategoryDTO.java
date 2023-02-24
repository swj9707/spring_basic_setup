package com.swj9707.test_api.v1.category.dto;

import com.swj9707.test_api.v1.category.model.Category;
import lombok.*;

import java.util.List;

public class CategoryDTO {

    private CategoryDTO () {}
    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CategoryInfo {
        private Long id;
        private String name;
        private String type;

        public static CategoryInfo fromEntity(Category entity) {
            return CategoryInfo.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .type(entity.getType())
                    .build();
        }

        public static List<CategoryInfo> fromEntities(List<Category> entities) {
            return entities.stream().map(CategoryInfo::fromEntity).toList();
        }
    }
}
