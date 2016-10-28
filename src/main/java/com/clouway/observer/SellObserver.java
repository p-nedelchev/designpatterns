package com.clouway.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class SellObserver implements Observer {
    private List<Product> soldProducts;

    public SellObserver() {
        this.soldProducts = new LinkedList<Product>();
    }

    @Override
    public void update(Product product, int actionId) {
        if(actionId == 1) {
            soldProducts.add(product);
        }
    }

    public List<Product> getSoldProducts() {
        return soldProducts;
    }
}
