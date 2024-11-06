package models;

import controllers.OrderController;

public class OrderProcessingFacade {
    private OrderController orderController;
    private Payment payment;
    private ConfigurationManager configManager;

    public OrderProcessingFacade() {
        orderController = new OrderController();
        configManager = new ConfigurationManager("config.properties");
    }

    public void addProductToOrder(Product product) {
        orderController.addProductToOrder(product);
    }

    public double getOrderTotal() {
        return orderController.getOrderTotal();
    }

    public void setPaymentMethod(String paymentMethod) {
        orderController.setPaymentMethod(paymentMethod);
    }

    public void processOrder(String paypal) {
        orderController.processPayment();
    }
}