package model;

import jakarta.persistence.*;

@Entity
public class ProductOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String storeName;
    private String url;
    private String priceSelector;

    ProductOffer() {}
    public ProductOffer(String storeName, String url, String priceSelector) {
        this.storeName = storeName;
        this.url = url;
        this.priceSelector = priceSelector;
    }



}
