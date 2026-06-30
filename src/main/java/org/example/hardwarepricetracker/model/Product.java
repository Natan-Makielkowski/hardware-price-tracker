package org.example.hardwarepricetracker.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
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
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "product",  cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<ProductOffer> offers =  new ArrayList<>();



}
