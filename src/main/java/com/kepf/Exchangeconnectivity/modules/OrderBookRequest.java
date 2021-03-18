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

}
