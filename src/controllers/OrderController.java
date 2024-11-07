package controllers;

import models.Order;
import models.Payment;
import models.PaymentFactory;
import models.Product;

public class OrderController{
    private Order order;
    private Payment paymentMethod;

    public OrderController(Order order) {
        this.order = order;
    }

    public OrderController() {

    }

    public void addProductToOrder(Product product) {
        order.addProduct(product);
    }

    public double getOrderTotal() {
        return order.calculateTotal();
    }

    public void setPaymentMethod(String paymentMethodType) {
        this.paymentMethod = PaymentFactory.createPayment(paymentMethodType);
    }

    public void processPayment() {
        double totalAmount = order.calculateTotal();
        paymentMethod.pay(totalAmount);
    }

}
