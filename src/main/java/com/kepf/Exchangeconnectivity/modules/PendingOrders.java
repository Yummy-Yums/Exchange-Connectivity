package com.kepf.Exchangeconnectivity.modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PendingOrders {
    private String product;
    private int quantity;
    private double price;
    private String side;
    private int cumulatitiveQuantity;
    private String exchange;

    public PendingOrders() {
    }

    public PendingOrders(String product, int quantity, double price, String side, int cumulatitiveQuantity, String exchange) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
        this.cumulatitiveQuantity = cumulatitiveQuantity;
        this.exchange = exchange;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getCumulatitiveQuantity() {
        return cumulatitiveQuantity;
    }

    public void setCumulatitiveQuantity(int cumulatitiveQuantity) {
        this.cumulatitiveQuantity = cumulatitiveQuantity;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "PendingOrders{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", side='" + side + '\'' +
                ", cumulatitiveQuantity=" + cumulatitiveQuantity +
                ", exchange='" + exchange + '\'' +
                '}';
    }
}
