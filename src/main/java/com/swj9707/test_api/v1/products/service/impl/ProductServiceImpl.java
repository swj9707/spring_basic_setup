package com.swj9707.test_api.v1.products.service.impl;

import com.swj9707.test_api.global.enums.CustomError;
import com.swj9707.test_api.global.error.CustomException;
import com.swj9707.test_api.v1.productcategory.model.ProductCategory;
import com.swj9707.test_api.v1.productcategory.model.repository.ProductCategoryRepository;
import com.swj9707.test_api.v1.products.dto.ProductDTO;
import com.swj9707.test_api.v1.products.dto.ProductReq;
import com.swj9707.test_api.v1.products.dto.ProductRes;
import com.swj9707.test_api.v1.products.model.Product;
import com.swj9707.test_api.v1.products.model.repository.ProductRepository;
import com.swj9707.test_api.v1.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductRes.AddProductRes createProduct(ProductReq.CreateProduct req) {
        if(productRepository.existsByName(req.getName())) {
            throw new CustomException(CustomError.DUPLICATE_PRODUCT_NAME);
        }

        Product product = Product.createProduct(req);
        productRepository.save(product);
        return new ProductRes.AddProductRes(ProductDTO.ProductInfo.fromEntity(product));

    }

    @Override
    public ProductDTO.ProductInfo getProduct(Long productId) {
        Product result = productRepository.findById(productId)
                .orElseThrow(() -> new CustomException(CustomError.PRODUCT_NOT_FOUND));
        return ProductDTO.ProductInfo.fromEntity(result);
    }

    @Override
    public List<ProductDTO.ProductInfo> getAllProducts() {
        return ProductDTO.ProductInfo.fromEntities(productRepository.findAll());
    }

    @Override
    public List<ProductDTO.ProductInfo> getProductsByCategoryId(Long categoryId) {
        List<ProductCategory> result = productCategoryRepository.findAllByCategoryId(categoryId);
        List<Product> productResult = result.stream().map(ProductCategory::getProduct).toList();
        return ProductDTO.ProductInfo.fromEntities(productResult);
    }
}
