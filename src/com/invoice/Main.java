package com.invoice;

public class Main {
    public static void main(String[] args) {

        // Create invoice
        Invoice invoice = new Invoice(101);

        // Add items
        invoice.addItem(new Item("Laptop", 50000, 1));
        invoice.addItem(new Item("Mouse", 500, 2));

        // Print invoice
        System.out.println(invoice.generateInvoiceText());

        // Save to file
        InvoiceService service = new InvoiceService();
        service.saveInvoiceToFile(invoice);
    }
}