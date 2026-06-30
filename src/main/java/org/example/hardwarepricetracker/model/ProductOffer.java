package org.example.hardwarepricetracker.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

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

    public ProductOffer() {}
    public ProductOffer(Product product, String storeName, String url, String priceSelector, boolean isActive) {
        this.product =  product;
        this.storeName = storeName;
        this.url = url;
        this.priceSelector = priceSelector;
        this.isActive = isActive;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;



    @OneToMany(mappedBy = "productOffer", cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<PriceSnapshot> priceSnapshots = new ArrayList<>();




}
