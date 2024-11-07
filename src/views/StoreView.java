// views/StoreView.java
package views;

import controllers.OrderController;

public class StoreView {
    private OrderController orderController;

    public StoreView(OrderController orderController) {
        this.orderController = orderController;
    }

    public void displayOrderTotal() {
        System.out.println("Order Total: $" + orderController.getOrderTotal());
    }

    public void displayPaymentConfirmation() {
        System.out.println("Payment processed successfully!");
    }

    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}
