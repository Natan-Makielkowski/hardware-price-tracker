package org.example.hardwarepricetracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class PriceSnapshot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int theReadPrice;
    private LocalDateTime priceDateTime;

    @ManyToOne
    @JoinColumn(name="product_offer_id")
    private ProductOffer productOffer;


    public PriceSnapshot() {}

    public PriceSnapshot(int theReadPrice, LocalDateTime priceDateTime, ProductOffer productOffer) {
        this.theReadPrice = theReadPrice;
        this.priceDateTime = priceDateTime;
        this.productOffer = productOffer;
    }
}
