package com.clouway.observertest;

import com.clouway.observer.Product;
import com.clouway.observer.SoldProductList;
import com.clouway.observer.Store;
import com.clouway.observer.Warehouse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class StoreTest {
    private Warehouse warehouse;
    private SoldProductList soldProductList;
    private Store store;



    @Before
    public void setUp() throws Exception {
        this.warehouse = new Warehouse();
        this.soldProductList = new SoldProductList();
        this.store = new Store(warehouse, soldProductList);
    }

    @Test
    public void productAddedOnStock() throws Exception {
        Product item = new Product("item", 2.50);
        store.stockProduct(item);
        assertThat(warehouse.getStatistic().size(),is(1));
    }

    @Test
    public void productRemovedOnSell() throws Exception {
        Product item = new Product("item", 2.00);
        store.stockProduct(item);
        store.sellProduct(item);
        assertThat(warehouse.getStatistic().size(), is(0));
    }

    @Test
    public void productAddedOnSell() throws Exception {
        Product item = new Product("item", 3.50);
        store.stockProduct(item);
        store.sellProduct(item);
        assertThat(soldProductList.getStatistic().size(), is(1));
    }
}
