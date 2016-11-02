package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Store extends Observable {
    private List<Observer> observers = new ArrayList<>();
    private Warehouse warehouse;
    private SoldProductList soldProducts;

    public Store(Warehouse warehouse, SoldProductList soldProducts) {
        super();
        this.warehouse = warehouse;
        this.soldProducts = soldProducts;
    }

    public void sellProduct(Product product) {
        warehouse.removeProduct(product);
        soldProducts.addProduct(product);
        setChanged();
        notifyObservers(this, product);
    }

    public void stockProduct(Product product) {
        warehouse.addProduct(product);
        setChanged();
        notifyObservers(this, product);
    }

    private void notifyObservers(Observable observable, Product product) {
        for(Observer observer : observers) {
            observer.update(observable, product);
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
