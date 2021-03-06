package de.uslu;

import java.util.HashMap;

public class Order {

    private String id;
    private HashMap<String, Product> products;

    public Order(HashMap<String, Product> products) {
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }
}
