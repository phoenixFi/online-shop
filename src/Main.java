import controllers.OrderController;
import models.*;
import views.StoreView;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product product1 = new Product(1, "Laptop", 1000);
        Product product2 = new Product(2, "Smartphone", 500);

        // Создание и настройка MVC-компонентов
        StoreView view = new StoreView();
        Order order = new Order();
        OrderController controller = new OrderController(view, order);

        // Добавление продуктов в заказ
        controller.addProductToOrder(product1);
        controller.addProductToOrder(product2);

        // Создание фасада для обработки заказа
        OrderProcessingFacade facade = new OrderProcessingFacade();
        facade.addProduct(product1);
        facade.addProduct(product2);
        facade.processOrder("paypal");

        // Применение наблюдателя
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