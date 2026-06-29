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


    Product() {}

    Product(String name, String url, String CssSelector) {
        this.name = name;

    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @OneToMany(mappedBy = "product_id",  cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductOffer> offers =  new ArrayList<>();

}
