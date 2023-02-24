package com.swj9707.test_api.v1.products.model;

import com.swj9707.test_api.v1.productcategory.model.ProductCategory;
import com.swj9707.test_api.v1.products.dto.ProductReq;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@ToString
@Table(name = "product")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private String description;
    private String thumbnail;

    public static Product createProduct(ProductReq.CreateProduct req) {
        return Product.builder()
                .name(req.getName())
                .price(req.getPrice())
                .description(req.getDescription())
                .thumbnail(req.getThumbnail())
                .build();
    }

}
