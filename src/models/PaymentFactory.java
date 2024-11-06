package models;

public class PaymentFactory {
    public static Payment createPayment(String method) {
        switch (method) {
            case "credit_card":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Unknown payment method.");
        }
    }
}
