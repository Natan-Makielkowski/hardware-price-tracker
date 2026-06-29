package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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


}
