package org.example.hardwarepricetracker.controller;

import org.example.hardwarepricetracker.dto.ProductRequestDto;
import org.example.hardwarepricetracker.dto.ProductResponseDto;
import org.example.hardwarepricetracker.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hwtracker")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponseDto> getAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<ProductResponseDto> getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ProductResponseDto saveProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.saveProduct(productRequestDto.name(), productRequestDto.category());
    }


}
