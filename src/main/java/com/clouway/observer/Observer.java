package com.clouway.observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public interface Observer {
    void update(Product product, int actionId);
}
