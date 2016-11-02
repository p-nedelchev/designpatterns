package com.clouway.observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Product {
    public final String name;
    public final Double price;
    public final int amount;

    public Product(String name, Double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
