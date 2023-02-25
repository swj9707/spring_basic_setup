package com.swj9707.test_api.v1.productcategory.service.impl;

import com.swj9707.test_api.global.enums.CustomError;
import com.swj9707.test_api.global.error.CustomException;
import com.swj9707.test_api.v1.category.model.Category;
import com.swj9707.test_api.v1.category.model.repository.CategoryRepository;
import com.swj9707.test_api.v1.productcategory.dto.ProductCategoryRes;
import com.swj9707.test_api.v1.productcategory.model.ProductCategory;
import com.swj9707.test_api.v1.productcategory.model.repository.ProductCategoryRepository;
import com.swj9707.test_api.v1.productcategory.service.ProductCategoryService;
import com.swj9707.test_api.v1.products.model.Product;
import com.swj9707.test_api.v1.products.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public ProductCategoryRes.CreateProductCategoryRes createProductCategory(Long categoryId, Long productId) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new CustomException(CustomError.PRODUCT_NOT_FOUND));

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CustomException(CustomError.CATEGORY_NOT_FOUND));

        if (productCategoryRepository.existsByCategoryIdAndProductId(categoryId, productId)) {
            throw new CustomException(CustomError.DUPLICATE_PRODUCT_CATEGORY);
        }

        ProductCategory result = ProductCategory
                .builder()
                .product(product)
                .category(category)
                .build();

        productCategoryRepository.save(result);

        return ProductCategoryRes.CreateProductCategoryRes.builder()
                .categoryId(categoryId)
                .productId(productId)
                .build();
    }
}
