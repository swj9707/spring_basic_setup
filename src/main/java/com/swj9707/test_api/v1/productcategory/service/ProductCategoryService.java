package com.swj9707.test_api.v1.productcategory.service;

import com.swj9707.test_api.v1.productcategory.dto.ProductCategoryRes;

public interface ProductCategoryService {
    ProductCategoryRes.CreateProductCategoryRes createProductCategory(Long categoryId, Long productId);

}
