package boxOffice;

public class Seat {
    private char row;
    private int seatNumber;
    private SeatType seatType;
    private boolean isAvailable;

    // TODO complete this class according to the specification
    public Seat(char row, int seatNumber, SeatType seatType) {
        if (row < 'A' || row > 'Z') {
            throw new IllegalArgumentException("Row must be a capital letter A-Z.");
        }
        if (seatNumber <= 0) {
            throw new IllegalArgumentException("Seat number must be a positive integer.");
        }
        this.row = row;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isAvailable = true;
    }
    


    public void setRow(char row) {
        this.row = row;
    }


    public void setSeatNum(int seatNum) {
        this.seatNumber = seatNumber;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

}