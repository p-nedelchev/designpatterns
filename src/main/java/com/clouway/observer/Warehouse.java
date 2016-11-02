package com.clouway.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Warehouse {
    private List<Product> warehouse;

    public Warehouse() {
        this.warehouse = new LinkedList<>();
    }

    public void addProduct(Product product) {
        warehouse.add(product);
    }

    public void removeProduct(Product product) {
        if(warehouse.size() != 0) {
            warehouse.remove(product);
        }
    }

    public List<Product> getStatistic() {
        return warehouse;
    }
}
