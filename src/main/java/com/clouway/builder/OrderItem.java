package com.clouway.builder;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class OrderItem {
    private String productName;
    private String measureUnit;
    private Double quantity;
    private Double price;

    private OrderItem(OrderItemBuilder builder) {
        this.productName = builder.newProductName;
        this.measureUnit = builder.newMeasureUnit;
        this.quantity = builder.newQuantity;
        this.price = builder.newPrice;
    }

    public static OrderItemBuilder newOrderItem() {
        return new OrderItemBuilder();
    }

    public static class OrderItemBuilder {
        private String newProductName;
        private String newMeasureUnit;
        private Double newQuantity;
        private Double newPrice;

        private OrderItemBuilder() {

        }

        public OrderItemBuilder productName(String productName) {
            this.newProductName = productName;
            return this;
        }

        public OrderItemBuilder measureUnit(String measureUnit) {
            this.newMeasureUnit = measureUnit;
            return this;
        }

        public OrderItemBuilder quantity(Double quantity) {
            this.newQuantity = quantity;
            return this;
        }

        public OrderItemBuilder price(Double price) {
            this.newPrice = price;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }

    public String getProductName() {
        return productName;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}
