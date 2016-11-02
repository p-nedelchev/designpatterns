package com.clouway.observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
