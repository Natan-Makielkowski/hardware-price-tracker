package org.example.hardwarepricetracker.repository;

import org.example.hardwarepricetracker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
