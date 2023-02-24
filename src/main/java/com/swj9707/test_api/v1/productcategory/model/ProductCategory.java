package com.swj9707.test_api.v1.productcategory.model;

import com.swj9707.test_api.v1.category.model.Category;
import com.swj9707.test_api.v1.products.model.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_category")
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
}
