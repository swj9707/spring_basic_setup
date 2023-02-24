package com.swj9707.test_api.v1.productcategory.dto;

import lombok.*;

public class ProductCategoryReq {
    private ProductCategoryReq() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateProductCategory {
        private Long categoryId;
        private Long productId;
    }
}
