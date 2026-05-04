package com.invoice;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceService {

    public void saveInvoiceToFile(Invoice invoice) {
        try {
            FileWriter writer = new FileWriter("invoice.txt", true);
            writer.write(invoice.generateInvoiceText());
            writer.write("\n---------------------\n");
            writer.close();

            System.out.println("✅ Invoice saved to file!");

        } catch (IOException e) {
            System.out.println("❌ Error saving invoice: " + e.getMessage());
        }
    }
}