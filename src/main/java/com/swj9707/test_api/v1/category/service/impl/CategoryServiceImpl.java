package com.swj9707.test_api.v1.category.service.impl;

import com.swj9707.test_api.global.enums.CustomError;
import com.swj9707.test_api.global.error.CustomException;
import com.swj9707.test_api.v1.category.dto.CategoryDTO;
import com.swj9707.test_api.v1.category.dto.CategoryReq;
import com.swj9707.test_api.v1.category.dto.CategoryRes;
import com.swj9707.test_api.v1.category.model.Category;
import com.swj9707.test_api.v1.category.model.repository.CategoryRepository;
import com.swj9707.test_api.v1.category.service.CategoryService;
import com.swj9707.test_api.v1.products.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Override
    public CategoryRes.AddCategoryRes addCategory(CategoryReq.GenerateCategory req) {
        Category category = Category.createCategory(req);
        categoryRepository.save(category);
        return CategoryRes.AddCategoryRes.fromEntity(category);
    }

    @Override
    public CategoryDTO.CategoryInfo getCategoryInfo(Long categoryId) {
        Category result = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CustomException(CustomError.CATEGORY_NOT_FOUND));
        return CategoryDTO.CategoryInfo.fromEntity(result);
    }

    @Override
    public List<CategoryDTO.CategoryInfo> getAllCategories() {
        return CategoryDTO.CategoryInfo.fromEntities(categoryRepository.findAll());
    }

    @Override
    public List<CategoryDTO.CategoryInfo> getAllByType(String type) {
        return CategoryDTO.CategoryInfo.fromEntities(categoryRepository.findAllByType(type));
    }
}
