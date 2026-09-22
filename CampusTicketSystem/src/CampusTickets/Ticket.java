package CampusTickets;

public class Ticket {
    private final int id;
    private final Event event;
    private final TicketType ticketType;
    private final String studentName;

    private boolean canceled;
    private boolean admitted;

    public Ticket(int id, Event event, TicketType ticketType, String studentName) {
        if (id <= 0) {
            throw new IllegalArgumentException("Ticket ID must be positive.");
        }

        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null.");
        }

        if (ticketType == null) {
            throw new IllegalArgumentException("Ticket type cannot be null.");
        }

        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be null or blank.");
        }

        this.id = id;
        this.event = event;
        this.ticketType = ticketType;
        this.studentName = studentName;

        this.canceled = false;
        this.admitted = false;
    }

    public boolean cancel() {
        if (canceled || admitted) {
            return false;
        }

        canceled = true;
        return true;
    }

    public boolean admit() {
        if (canceled || admitted) {
            return false;
        }

        admitted = true;
        return true;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    public boolean isActive() {
        return !canceled && !admitted;
    }

    public int getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        String status;

        if (canceled) {
            status = "Canceled";
        } else if (admitted) {
            status = "Admitted";
        } else {
            status = "Active";
        }

        return "Ticket #" + id
                + " | Student: " + studentName
                + " | Event: " + event
                + " | Type: " + ticketType
                + " | Status: " + status;
    }
}