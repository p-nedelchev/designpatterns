package com.clouway.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class SellListener implements Observer {
    private List<Product> soldProducts;

    public SellListener() {
        this.soldProducts = new LinkedList<Product>();
    }


    @Override
    public void onProductSell(Product product) {

    }

    @Override
    public void onProductStock(Product product) {

    }

    @Override
    public List<Product> getCurrentProducts() {
        return null;
    }
}
