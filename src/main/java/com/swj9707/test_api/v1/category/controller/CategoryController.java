package com.swj9707.test_api.v1.category.controller;

import com.swj9707.test_api.global.common.BaseRes;
import com.swj9707.test_api.v1.category.dto.CategoryDTO;
import com.swj9707.test_api.v1.category.dto.CategoryReq;
import com.swj9707.test_api.v1.category.dto.CategoryRes;
import com.swj9707.test_api.v1.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;
    @PostMapping("/add")
    public ResponseEntity<BaseRes<CategoryRes.AddCategoryRes>> addCategory(@RequestBody CategoryReq.GenerateCategory req) {
        CategoryRes.AddCategoryRes res = categoryService.addCategory(req);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }

    @GetMapping("/categoryInfo")
    public ResponseEntity<BaseRes<CategoryDTO.CategoryInfo>> getCategoryInfo(@RequestParam(name = "id", defaultValue = "") Long categoryId) {
        CategoryDTO.CategoryInfo res = categoryService.getCategoryInfo(categoryId);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }
    @GetMapping("/getAll")
    public ResponseEntity<BaseRes<List<CategoryDTO.CategoryInfo>>> getCategories() {
        List<CategoryDTO.CategoryInfo> res = categoryService.getAllCategories();
        return ResponseEntity.ok().body(BaseRes.success(res));
    }

    @GetMapping("/type")
    public ResponseEntity<BaseRes<List<CategoryDTO.CategoryInfo>>> getCategoriesByType(@RequestParam(name = "type", defaultValue = "") String type) {
        List<CategoryDTO.CategoryInfo> res = categoryService.getAllByType(type);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }
}
