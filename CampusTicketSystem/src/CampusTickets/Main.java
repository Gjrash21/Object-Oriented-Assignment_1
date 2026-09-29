package CampusTickets;

public class Main{
    public static void main(String args[]){

        TicketManager manager = new TicketManager(new TicketBook(5));

        Event event1 = new Event("Volleyball Game", "Hearnes Center");
        Event event2 = new Event("Football Game", "Farot Field");

        TicketType volleyballGame = new TicketType("Volleyball", 80);
        TicketType footballGame = new TicketType("Football", 100);

        Ticket ticket1 = manager.createTicket(0, event1, volleyballGame, "Jack");
        Ticket ticket2 = manager.createTicket(0, event1, volleyballGame, "Sarah");
        Ticket ticket3 = manager.createTicket(0, event1, volleyballGame, "Ana");
        Ticket ticket4 = manager.createTicket(0, event2, footballGame, "Caleb");
        Ticket ticket5 = manager.createTicket(0, event2, footballGame, "Mark");

        ticket5.cancel();

        ticket2.admit();

        ticket5.admit();

        System.out.println("\n");

        manager.printAllTickets();

        System.out.println("\n");

        manager.printTicketsForEvent(event1);

    }
}