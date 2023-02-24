package com.swj9707.test_api.v1.category.service;

import com.swj9707.test_api.v1.category.dto.CategoryDTO;
import com.swj9707.test_api.v1.category.dto.CategoryReq;
import com.swj9707.test_api.v1.category.dto.CategoryRes;

import java.util.List;

public interface CategoryService {
    CategoryRes.AddCategoryRes addCategory(CategoryReq.GenerateCategory req);
    CategoryDTO.CategoryInfo getCategoryInfo(Long categoryId);
    List<CategoryDTO.CategoryInfo> getAllCategories();
    List<CategoryDTO.CategoryInfo> getAllByType(String type);

}
