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

    Product() {}

    Product(String name, String url, String CssSelector) {
        this.name = name;
        this.url = url;
        this.CssSelector = CssSelector;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }
    public String getCssSelector() {
        return CssSelector;
    }

}
