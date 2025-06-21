package AdapterPattern;

public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor razorpay = new RazorpayAdapter();
        paypal.processPayment(2500.00);
        razorpay.processPayment(1000.00);
    }
}
