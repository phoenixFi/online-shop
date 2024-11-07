
package controllers;

import models.*;

public class OrderController {
    private Order order;
    private Payment paymentMethod;

    public OrderController(Order order) {
        this.order = order;
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String defaultStatus = configManager.getConfig("order.defaultStatus");
        order.setStatus(defaultStatus);
    }

    public void setPaymentMethod(String method) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String defaultPaymentMethod = configManager.getConfig("payment.defaultMethod");
        if (method == null) {
            method = defaultPaymentMethod;
        }
        this.paymentMethod = PaymentFactory.createPayment(method);
    }

    public void addProductToOrder(Product product) {
        order.addProduct(product);
    }

    public double getOrderTotal() {
        return order.calculateTotal();
    }

    public void processPayment() {
        if (paymentMethod != null) {
            paymentMethod.pay(order.calculateTotal());
        } else {
            System.out.println("No payment method selected.");
        }
    }
}
