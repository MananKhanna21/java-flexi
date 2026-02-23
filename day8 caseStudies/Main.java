class SeatNotAvailableException extends Exception {
    SeatNotAvailableException(String message) {
        super(message);
    }
}

class Movie {
    String name;
    int availableSeats;

    Movie(String name, int seats) {
        this.name = name;
        this.availableSeats = seats;
    }

    void bookTicket(int seats) throws SeatNotAvailableException {
        if (seats > availableSeats) {
            throw new SeatNotAvailableException("Seats not available");
        }
        availableSeats -= seats;
        System.out.println("Booked " + seats + " seats");
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", 5);
        try {
            m.bookTicket(3);
            m.bookTicket(3);
        } catch (SeatNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}