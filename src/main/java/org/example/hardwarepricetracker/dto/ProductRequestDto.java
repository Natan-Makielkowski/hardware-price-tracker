package org.example.hardwarepricetracker.dto;

import org.example.hardwarepricetracker.model.Category;

public record ProductRequestDto(String name, Category category) {
}
