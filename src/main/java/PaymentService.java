public class PaymentService {
    public void processPayment(String paymentMethod, double amount) {
        System.out.println("Pagamento de R$" + amount + " processado via " + paymentMethod);
    }
}
