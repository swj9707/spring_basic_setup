package com.swj9707.test_api.v1.productcategory.model.repository;

import com.swj9707.test_api.v1.productcategory.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    List<ProductCategory> findAllByCategoryId(Long categoryId);
    boolean existsByCategoryIdAndProductId(Long categoryId, Long productId);
}
