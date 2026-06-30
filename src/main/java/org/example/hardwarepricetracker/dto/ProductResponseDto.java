package org.example.hardwarepricetracker.dto;

import org.example.hardwarepricetracker.model.Category;

public record ProductResponseDto(Integer id,String name, Category category) {
}
