package com.swj9707.test_api.v1.productcategory.dto;

import com.swj9707.test_api.v1.category.dto.CategoryDTO;
import com.swj9707.test_api.v1.products.dto.ProductDTO;
import lombok.*;

public class ProductCategoryRes {
    private ProductCategoryRes() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateProductCategoryRes {
        private Long categoryId;
        private Long productId;
    }

    @Getter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProductCategoryInfo {
        private CategoryDTO.CategoryInfo categoryInfo;
        private ProductDTO.ProductInfo productInfo;
    }
}
