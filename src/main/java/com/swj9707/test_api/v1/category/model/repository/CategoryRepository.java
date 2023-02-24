package com.swj9707.test_api.v1.category.model.repository;

import com.swj9707.test_api.v1.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(String categoryName);
    List<Category> findAllByType(String type);
}
