package boxOffice;

import java.util.Objects;

/**
 * Represents an individual seat in a venue.
 */
public class Seat {
    private final char row;
    private final int seatNumber;
    private final SeatType seatType;
    private boolean isAvailable;

    /**
     * Constructor to initialize a Seat.
     * @param row the row letter
     * @param seatNumber the seat number
     * @param seatType the type of the seat
     */
    public Seat(char row, int seatNumber, SeatType seatType) {
        if (row < 'A' || row > 'Z') {
            throw new IllegalArgumentException("Row must be a capital letter A through Z.");
        }
        if (seatNumber <= 0) {
            throw new IllegalArgumentException("Seat number must be a positive integer.");
        }
        this.row = row;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isAvailable = true;
    }

    public char getRow() {
        return row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Seat " + row + seatNumber + " (" + seatType + "), Available: " + isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Seat)) return false;
        Seat other = (Seat) obj;
        return row == other.row && seatNumber == other.seatNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seatNumber);
    }
}
