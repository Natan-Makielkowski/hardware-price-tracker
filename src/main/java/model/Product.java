package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @GeneratedValue
    @Id
    private Integer id;

    private String name;
    private String url;
    private String CssSelector;
}
