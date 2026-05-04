package com.invoice;

import java.util.ArrayList;

public class Invoice {
    private int id;
    private ArrayList<Item> items = new ArrayList<>();

    public Invoice(int id) {
        this.id = id;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public String generateInvoiceText() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice ID: ").append(id).append("\n");

        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }

        sb.append("Total Amount: ").append(calculateTotal()).append("\n");
        return sb.toString();
    }
}