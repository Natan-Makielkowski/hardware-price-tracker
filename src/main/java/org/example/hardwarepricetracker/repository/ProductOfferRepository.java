package org.example.hardwarepricetracker.repository;

import org.example.hardwarepricetracker.model.ProductOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOfferRepository extends JpaRepository<ProductOffer, Integer> {
}
