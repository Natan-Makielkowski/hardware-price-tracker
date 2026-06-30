package org.example.hardwarepricetracker.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private Category category;


    Product() {}

    Product(String name, Category category) {
        this.name = name;
        this.category = category;

    }

    @OneToMany(mappedBy = "product_id",  cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductOffer> offers =  new ArrayList<>();

}
