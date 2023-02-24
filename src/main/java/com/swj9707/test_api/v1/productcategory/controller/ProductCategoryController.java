package com.swj9707.test_api.v1.productcategory.controller;

import com.swj9707.test_api.global.common.BaseRes;
import com.swj9707.test_api.v1.productcategory.dto.ProductCategoryRes;
import com.swj9707.test_api.v1.productcategory.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product/category")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @PostMapping("/insert")
    public ResponseEntity<BaseRes<ProductCategoryRes.CreateProductCategoryRes>> createProductCategory(@RequestParam(name = "categoryId", defaultValue = "") Long categoryId,
                                                                                                      @RequestParam(name = "productId", defaultValue = "") Long productId) {
        ProductCategoryRes.CreateProductCategoryRes res = productCategoryService.createProductCategory(categoryId, productId);
        return ResponseEntity.ok().body(BaseRes.success((res)));
    }

}
