package com.invoice;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String toString() {
        return name + " | Price: " + price + " | Qty: " + quantity + " | Total: " + getTotal();
    }
}