package com.swj9707.test_api.v1.products.dto;

import lombok.*;

public class ProductReq {
    private ProductReq() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateProduct {
        private String name;
        private Integer price;
        private String description;
        private String thumbnail;
    }
}
