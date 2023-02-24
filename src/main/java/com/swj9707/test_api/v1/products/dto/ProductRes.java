package com.swj9707.test_api.v1.products.dto;

import lombok.*;

public class ProductRes {
    private ProductRes() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @NoArgsConstructor
    public static class AddProductRes {
        private ProductDTO.ProductInfo result;
        public AddProductRes(ProductDTO.ProductInfo result){
            this.result = result;
        }
    }
}
