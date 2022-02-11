package de.uslu;

import java.util.Collection;
import java.util.HashMap;

public class ProductRepo {

    private HashMap<String,Product> products;

    public ProductRepo() {
        products = new HashMap<>();
    }

    public Collection<Product> list(){
        return products.values();
    }

    public Product get(String id){
        return products.get(id);
    }

    public void add(Product newProduct){
        products.put(newProduct.getId(), newProduct);
    }
}
