package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Shop implements Observable {
    private List<Observer> observers;

    public Shop() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
