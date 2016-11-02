package com.clouway.observer;


import java.util.*;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class SoldProductList {
    private List<Product> soldProducts;

    public SoldProductList() {
        this.soldProducts = new LinkedList<>();
    }

    public void addProduct(Product product) {
        product.setAvailability(false);
        soldProducts.add(product);
    }

    public List<Product> getStatistic() {
        return soldProducts;
    }
}
