package FactoryMethod;

class PaymentFactory {
    public static Payment createPayment(String type) {
        return switch (type) {
            case "credit" -> new CreditCardPayment();
            case "e-wallet" -> new EWalletPayment();
            default -> throw new IllegalArgumentException("Unknown payment type");
        };
    }
}
