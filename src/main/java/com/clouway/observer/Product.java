package com.clouway.observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Product {
    private String name;
    private Double price;
    private boolean availability;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.availability = true;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
