public class Main {
    public static void main(String[] args) {
        TicketFacade facade = new TicketFacade();
        facade.buyTicket("Show do Wesley Safadão", 2, "Cartão de Crédito", 500.00, "cliente@email.com");
    }
}
