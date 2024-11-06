package views;

import models.Product;
import java.util.List;

public class StoreView {
    public void displayProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}