public class TicketFacade {
    private TicketService ticketService;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public TicketFacade() {
        this.ticketService = new TicketService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    public void buyTicket(String event, int quantity, String paymentMethod, double amount, String email) {
        ticketService.reserveTicket(event, quantity);
        paymentService.processPayment(paymentMethod, amount);
        notificationService.sendConfirmation(email);
        System.out.println("Compra concluída com sucesso!");
    }
}
