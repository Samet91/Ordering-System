package de.uslu;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void myAddProductShouldBeAddInNewShopService() {

        Product product = new Product("Banane", "1");
        HashMap<String, Product> map = new HashMap<>();
        ProductRepo productsRepo = new ProductRepo(map);
        OrderRepo orders = new OrderRepo();

        ShopService newShopService = new ShopService(orders, productsRepo);
        newShopService.addProduct(product);
        var result = newShopService.getProduct(String.valueOf(1));
        assertEquals(product, result);
    }


}