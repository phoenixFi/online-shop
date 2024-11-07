// Main.java
import models.*;
import controllers.OrderController;
import views.StoreView;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product product1 = new Product(1, "Laptop", 1000.00);
        Product product2 = new Product(2, "Smartphone", 500.00);

        // Создание заказа
        Order order = new Order();

        // Создание контроллера заказа
        OrderController orderController = new OrderController(order);

        // Добавление продуктов в заказ
        orderController.addProductToOrder(product1);
        orderController.addProductToOrder(product2);

        // Создание представления
        StoreView view = new StoreView(orderController);

        // Отображение общей стоимости заказа
        view.displayOrderTotal();

        // Выбор метода оплаты и обработка заказа
        orderController.setPaymentMethod("credit_card");
        orderController.processPayment();
        view.displayPaymentConfirmation();
    }
}
