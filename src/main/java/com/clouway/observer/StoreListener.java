package com.clouway.observer;

import org.apache.log4j.Logger;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class StoreListener implements Observer {
    private static Logger logger = Logger.getLogger(StoreListener.class);

    @Override
    public void update(Observable o, Object arg) {
        Product product = (Product) arg;
        if(!product.isAvailable()) {
            logger.info(product.getName() + " has been sold out");
            return;
        }
        logger.info(product.getName() + " has been stocked");
    }
}
