package com.clouway.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Shop implements Vendor {
    private List<Observer> observers;
    private List<Product> products;

    public Shop() {
        this.observers = new LinkedList<Observer>();
        this.products = new LinkedList<Product>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void sell(Product product) {
        products.remove(product);
        notifyObservers(product, 1);
    }

    @Override
    public void deliver(Product product) {
        products.add(product);
        notifyObservers(product, 0);
    }


    private void notifyObservers(Product product, int actionId) {
        observers.stream().forEach(observer -> observer.update(product, actionId));
    }
}
