// models/OrderProcessingFacade.java
package models;

public class OrderProcessingFacade {
    private Order order;
    private Payment payment;

    public OrderProcessingFacade(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }
    public void processOrder() {
        double totalAmount = order.calculateTotal();
        payment.pay(totalAmount);
        System.out.println("Order processed successfully!");
    }
}
