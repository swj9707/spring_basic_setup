package com.swj9707.test_api.v1.products.model.repository;

import com.swj9707.test_api.v1.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByName(String name);
}
