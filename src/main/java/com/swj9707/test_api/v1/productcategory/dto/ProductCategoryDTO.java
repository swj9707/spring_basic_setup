package com.swj9707.test_api.v1.productcategory.dto;

import lombok.*;

public class ProductCategoryDTO {
    private ProductCategoryDTO() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProductCategoryInfo {
        private Long id;
        private Long categoryId;
        private Long productId;
    }
}
