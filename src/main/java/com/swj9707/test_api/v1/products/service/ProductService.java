package com.swj9707.test_api.v1.products.service;

import com.swj9707.test_api.v1.products.dto.ProductDTO;
import com.swj9707.test_api.v1.products.dto.ProductReq;
import com.swj9707.test_api.v1.products.dto.ProductRes;

import java.util.List;

public interface ProductService {
    ProductRes.AddProductRes createProduct(ProductReq.CreateProduct req);
    ProductDTO.ProductInfo getProduct(Long productId);
    List<ProductDTO.ProductInfo> getAllProducts();
    List<ProductDTO.ProductInfo> getProductsByCategoryId(Long categoryId);
}
