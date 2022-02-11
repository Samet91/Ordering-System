package de.uslu;

public class Product {

    private String id;
    private String name;

    public Product(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
