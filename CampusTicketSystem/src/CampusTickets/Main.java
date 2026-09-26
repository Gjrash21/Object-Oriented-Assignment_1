package CampusTickets;

public class Main{
    public static void main(String args[]){
        Event event1 = new Event("Volleyball Game", "Hearnes Center");
        Event event2 = new Event("Football Game", "Farot Field");

        TicketType volleyballGame = new TicketType("Volleyball", 80);
        TicketType footballGame = new TicketType("Football", 100);

        Ticket ticket1 = new Ticket(1, event1, volleyballGame, "Jack");
        Ticket ticket2 = new Ticket(2, event1, volleyballGame, "Sarah");
        Ticket ticket3 = new Ticket(3, event1, volleyballGame, "Ana");
        Ticket ticket4 = new Ticket(4, event2, footballGame, "Caleb");
        Ticket ticket5 = new Ticket(5, event2, footballGame, "Mark");

        ticket5.cancel();
        ticket2.admit();

        ticket5.admit();

    }
}