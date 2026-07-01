package org.example.hardwarepricetracker.dto;

import org.example.hardwarepricetracker.model.ProductOffer;

import java.time.LocalDateTime;

public record PriceSnapshotResponseDto(Integer id, double theReadPrice, LocalDateTime priceDateTime, ProductOffer productOffer) {
}
