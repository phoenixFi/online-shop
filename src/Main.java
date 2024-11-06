import controllers.OrderController;
import models.*;
import views.StoreView;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1000);
        Product product2 = new Product(2, "Smartphone", 500);

        StoreView view = new StoreView();
        Order order = new Order();
        OrderController controller = new OrderController(view, order);

        controller.addProductToOrder(product1);
        controller.addProductToOrder(product2);

        OrderProcessingFacade facade = new OrderProcessingFacade();
        facade.addProduct(product1);
        facade.addProduct(product2);
        facade.processOrder("paypal");

        OrderObserver observer = new OrderObserver() {
            @Override
            public void update(String status) {
                System.out.println("Order status updated: " + status);
            }
        };
        order.addObserver(observer);
        order.setStatus("Shipped");
    }
}