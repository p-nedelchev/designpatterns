package com.clouway.builder;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Order {
    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date orderCreationDate;
    private Date orderDeliveryDate;
    private List<OrderItem> items;

    private Order(OrderBuilder builder){
        this.orderId = builder.newId;
        this.customerName = builder.newCustomerName;
        this.customerAddress = builder.newCustomerAddress;
        this.orderCreationDate = builder.newOrderCreationDate;
        this.orderDeliveryDate = builder.newOrderDeliveryDate;
        this.items = builder.newItems;
    }
    public static OrderBuilder newOrder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private Long newId;
        private String newCustomerName;
        private String newCustomerAddress;
        private Date newOrderCreationDate;
        private Date newOrderDeliveryDate;
        private List<OrderItem> newItems;

        private OrderBuilder(){
            newItems = new LinkedList<OrderItem>();
        }

        public OrderBuilder orderId(Long id) {
            this.newId = id;
            return this;
        }

        public OrderBuilder customerName(String name) {
            this.newCustomerName = name;
            return this;
        }

        public OrderBuilder customerAddress(String address) {
            this.newCustomerAddress = address;
            return this;
        }

        public OrderBuilder orderCreationDate(Date date) {
            this.newOrderCreationDate = date;
            return this;
        }

        public OrderBuilder orderDeliveryDate(Date date) {
            this.newOrderDeliveryDate = date;
            return this;
        }

        public OrderBuilder items(List<OrderItem> itemList) {
            this.newItems = itemList;
            return this;
        }

        public OrderBuilder item(OrderItem item) {
            this.newItems.add(item);
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Date getOrderCreationDate() {
        return orderCreationDate;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public boolean isDelayed(Date date) {
        return date.after(orderDeliveryDate);
    }
}
