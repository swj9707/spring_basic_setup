package com.swj9707.test_api.v1.products.dto;

import com.swj9707.test_api.v1.products.model.Product;
import lombok.*;

import java.util.List;

public class ProductDTO {

    private ProductDTO() {
        throw new IllegalStateException("DTO Class");
    }
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class ProductInfo {
        private Long id;
        private String name;
        private Integer price;
        private String description;
        private String thumbnail;

        public static ProductInfo fromEntity(Product entity) {
            return ProductInfo.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .price(entity.getPrice())
                    .description(entity.getDescription())
                    .thumbnail(entity.getThumbnail())
                    .build();
        }

        public static List<ProductInfo> fromEntities(List<Product> entities) {
            return entities.stream().map(ProductInfo::fromEntity).toList();
        }
    }

}
