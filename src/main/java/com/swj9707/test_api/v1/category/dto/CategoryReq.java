package com.swj9707.test_api.v1.category.dto;

import lombok.*;

public class CategoryReq {
    private CategoryReq() {}
    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GenerateCategory {
        private String name;
        private String type;
    }
}
