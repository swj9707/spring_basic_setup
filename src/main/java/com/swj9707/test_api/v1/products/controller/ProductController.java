package com.swj9707.test_api.v1.products.controller;

import com.swj9707.test_api.global.common.BaseRes;
import com.swj9707.test_api.v1.products.dto.ProductDTO;
import com.swj9707.test_api.v1.products.dto.ProductReq;
import com.swj9707.test_api.v1.products.dto.ProductRes;
import com.swj9707.test_api.v1.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<BaseRes<ProductRes.AddProductRes>> addProduct(@RequestBody ProductReq.CreateProduct req) {
        ProductRes.AddProductRes res = productService.createProduct(req);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }

    @GetMapping("/getAll")
    public ResponseEntity<BaseRes<List<ProductDTO.ProductInfo>>> getAllProducts() {
        List<ProductDTO.ProductInfo> res = productService.getAllProducts();
        return ResponseEntity.ok().body(BaseRes.success(res));
    }

    @GetMapping("/getInfo")
    public ResponseEntity<BaseRes<ProductDTO.ProductInfo>> getProductByName(@RequestParam(name = "id", defaultValue = "") Long productId) {
        ProductDTO.ProductInfo res = productService.getProduct(productId);
        return ResponseEntity.ok().body(BaseRes.success(res));
    }

    @GetMapping("/getProducts/category")
    public ResponseEntity<BaseRes<List<ProductDTO.ProductInfo>>> getProducts(@RequestParam(name = "id", defaultValue = "") Long categoryId) {
        List<ProductDTO.ProductInfo> res = productService.getProductsByCategoryId(categoryId);
        return ResponseEntity.ok().body(BaseRes.success((res)));
    }

}
