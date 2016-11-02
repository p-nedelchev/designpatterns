package com.clouway.observer;

import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public interface Observer {
    void onProductSell(Product product);
    void onProductStock(Product product);
    List<Product> getCurrentProducts();
}
