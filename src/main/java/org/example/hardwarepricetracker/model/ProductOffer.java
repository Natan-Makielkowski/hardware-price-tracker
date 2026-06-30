package org.example.hardwarepricetracker.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ProductOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String storeName;
    private String url;
    private String priceSelector;
    private boolean isActive;

    ProductOffer() {}
    public ProductOffer(String storeName, String url, String priceSelector, boolean isActive) {
        this.storeName = storeName;
        this.url = url;
        this.priceSelector = priceSelector;
        this.isActive = isActive;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;




}
