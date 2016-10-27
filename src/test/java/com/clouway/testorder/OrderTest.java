package com.clouway.testorder;

import com.clouway.builder.Order;
import org.junit.Test;

import java.util.Date;

import static com.clouway.builder.Order.newOrder;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class OrderTest {

    @Test
    public void orderNotDelayed() throws Exception {
        Order order = newOrder()
                .orderDeliveryDate(new Date(15))
                .build();
        boolean actual = order.isDelayed(new Date(10));
        assertThat(actual, is(false));
    }

    @Test
    public void orderDelayed() throws Exception {
        Order order = newOrder()
                .orderDeliveryDate(new Date(17))
                .build();
        boolean actual = order.isDelayed(new Date(20));
        assertThat(actual, is(true));
    }
}
