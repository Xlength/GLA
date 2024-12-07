package boxOffice;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a venue with multiple rows of seats.
 */
public class Venue {
    private final List<List<Seat>> rows;

    /**
     * Constructor to initialize the venue from a configuration string.
     * @param config the string specifying the venue layout
     */
    public Venue(String config) {
        rows = new ArrayList<>();
        String[] lines = config.split("\n");
        int numRows = Integer.parseInt(lines[0]);

        for (int i = 1; i <= numRows; i++) {
            String[] seatTypes = lines[i].split(" ");
            List<Seat> row = new ArrayList<>();
            char rowLabel = (char) ('A' + i - 1);
            for (int j = 0; j < seatTypes.length; j++) {
                row.add(new Seat(rowLabel, j + 1, SeatType.valueOf(seatTypes[j])));
            }
            rows.add(row);
        }
    }

    public Seat getSeat(char row, int seatNum) {
        int rowIndex = row - 'A';
        if (rowIndex < 0 || rowIndex >= rows.size()) {
            throw new IllegalArgumentException("Invalid row: " + row);
        }
        List<Seat> rowSeats = rows.get(rowIndex);
        if (seatNum <= 0 || seatNum > rowSeats.size()) {
            throw new IllegalArgumentException("Invalid seat number: " + seatNum);
        }
        return rowSeats.get(seatNum - 1);
    }

    public void printDetails() {
        for (List<Seat> row : rows) {
            for (Seat seat : row) {
                System.out.println(seat);
            }
        }
    }
}
