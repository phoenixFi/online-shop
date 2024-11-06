package FactoryMethod;

class EWalletPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing e-wallet payment: " + amount);
    }
}
