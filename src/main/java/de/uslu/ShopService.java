package de.uslu;

import java.util.Collection;

public class ShopService {

    private OrderRepo myOrders;
    private ProductRepo myProducts;

    public ShopService(OrderRepo myOrders, ProductRepo myProducts) {
        this.myOrders = myOrders;
        this.myProducts = myProducts;
    }

    public Product getProduct(String id) {
        return myProducts.get(id);
    }

    public void addProduct(Product newProduct) {
        myProducts.add(newProduct);
    }

    public Collection<Product> listProducts() {
        return myProducts.list();
    }

    public void addOrder(Order newOrder) {
        myOrders.add(newOrder);
    }

    public Order getOrder(String id) {
        return myOrders.get(id);
    }

    public Collection<Order> listOrders() {
        return myOrders.list();
    }

}
