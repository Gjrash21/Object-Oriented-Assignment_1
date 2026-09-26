package CampusTickets;

public class TicketManager {
	private TicketBook ticketBook;
	private int nextId;
	
	public TicketManager(TicketBook ticketBook) {
		if (ticketBook == null) {
			throw new IllegalArgumentException("TicketBook can't be null.")
		}
		
		this.ticketBook = ticketBook;
		this.nextId = 1;
	}
	
	public Ticket createTicket(int id, Event event, TicketType ticketType, String studentName) {
		Ticket ticket = ticketBook.createTicket(nextId, event, ticketType, studentName);
		nextId++;
		
		return ticket;
	}
	
	public boolean cancelTicket(int id) {
		Ticket ticket = ticketBook.findById(id);
		
		if (ticket == null) {
			throw new IllegalArgumentException("No ticket found with ID" + id + ".");
		}
		
		return ticket.cancel();
	}
	
	public boolean admitTicket(int id) {
		Ticket ticket = ticketBook.findById(id);
		
		if (ticket == null) {
			throw new IllegalArgumentException("No ticket found with ID" + id + "."); 
		}
		
		return ticket.admit();
	}
	
	public void printAllTickets() {
		ticketBook.printAll();
	}
	
	public void printTicketsForEvent(Event event) {
		ticketBook.printForEvent(event);
	}
}