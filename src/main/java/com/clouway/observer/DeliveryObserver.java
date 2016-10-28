package com.clouway.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class DeliveryObserver implements Observer {
    private List<Product> currentProducts;

    public DeliveryObserver() {
        this.currentProducts = new LinkedList<Product>();
    }

    @Override
    public void update(Product product, int actionId) {
        if(actionId == 0) {
            currentProducts.add(product);
        }
    }

    public List<Product> getCurrentProducts() {
        return currentProducts;
    }
}
