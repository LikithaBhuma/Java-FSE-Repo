package StrategyPattern;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card payment
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(1500.00);

        // Switch to PayPal payment
        context.setPaymentStrategy(new PayPalPayment("user@exam.com"));
        context.executePayment(2750.00);
    }
}
