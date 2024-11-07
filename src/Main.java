import models.*;
import controllers.OrderController;
import views.StoreView;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1000.00);
        Product product2 = new Product(2, "Smartphone", 500.00);

        Order order = new Order();

        OrderController orderController = new OrderController(order);

        orderController.addProductToOrder(product1);
        orderController.addProductToOrder(product2);

        StoreView view = new StoreView(orderController);

        view.displayOrderTotal();

        orderController.setPaymentMethod("credit_card");
        orderController.processPayment();
        view.displayPaymentConfirmation();
    }
}

