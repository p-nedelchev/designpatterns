package com.clouway.singleton;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
