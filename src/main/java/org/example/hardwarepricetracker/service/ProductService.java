package org.example.hardwarepricetracker.service;

import org.example.hardwarepricetracker.dto.ProductResponseDto;
import org.example.hardwarepricetracker.model.Category;
import org.example.hardwarepricetracker.model.Product;
import org.example.hardwarepricetracker.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResponseDto> getAllProducts() {
        return productRepository.findAll().stream().map(this::mapToResponseDto).toList();
    }

    public Optional<ProductResponseDto> getProductById(int id) {
        return productRepository.findById(id).map(this::mapToResponseDto);
    }

    public ProductResponseDto saveProduct(String name, Category category) {
        Product savedProduct = productRepository.save(new Product(name, category));
        return new ProductResponseDto(savedProduct.getId(), savedProduct.getName(), savedProduct.getCategory());
    }

    private ProductResponseDto mapToResponseDto(Product product) {
        return new ProductResponseDto(product.getId(), product.getName(), product.getCategory());
    }


}
