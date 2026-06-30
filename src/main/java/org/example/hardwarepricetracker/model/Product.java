package org.example.hardwarepricetracker.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private Category category;


    public Product() {}

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;

    }

    @OneToMany(mappedBy = "product",  cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<ProductOffer> offers =  new ArrayList<>();



}
