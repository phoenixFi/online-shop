package controllers;

import models.Order;
import models.Product;
import views.StoreView;

public class OrderController {
    private StoreView view;
    private Order order;

    public OrderController(StoreView view, Order order) {
        this.view = view;
        this.order = order;
    }

    public void addProductToOrder(Product product) {
        order.addProduct(product);
        view.showMessage(product.getName() + " added to the order.");
    }

    public void checkout() {
        double total = order.calculateTotal();
        view.showMessage("Total order price: $" + total);
    }
}