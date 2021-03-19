package com.kepf.Exchangeconnectivity.modules;

public class OrderBookRequest {
    public String id;
    public String side;
    public String product;

    public OrderBookRequest() {
    }

    public OrderBookRequest(String id, String side, String product) {
        this.id = id;
        this.side = side;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderBookRequest{" +
                "id='" + id + '\'' +
                ", side='" + side + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
