package com.clouway.observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public interface Vendor {
    void register(Observer observer);
    void sell(Product product);
    void deliver(Product product);
}
