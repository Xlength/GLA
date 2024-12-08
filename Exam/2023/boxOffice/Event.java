package boxOffice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents an event at a venue.
 */
public class Event {
    private final Venue venue;
    private final Map<SeatType, Integer> priceStructure;

    public Event(Venue venue, Map<SeatType, Integer> priceStructure) {
        this.venue = venue;
        this.priceStructure = new HashMap<>(priceStructure);
    }

    public int reserveSeats(int numSeats, SeatType seatType) {
        for (List<Seat> row : venue.getRows()) {
            int consecutive = 0;
            int start = -1;
            for (int i = 0; i < row.size(); i++) {
                Seat seat = row.get(i);
                if (seat.getSeatType() == seatType && seat.isAvailable()) {
                    if (consecutive == 0) start = i;
                    consecutive++;
                    if (consecutive == numSeats) {
                        for (int j = start; j < start + numSeats; j++) {
                            row.get(j).setAvailable(false);
                        }
                        return priceStructure.get(seatType) * numSeats;
                    }
                } else {
                    consecutive = 0;
                }
            }
        }
        return -1;
    }

    public void returnSeat(char row, int seatNum) {
        Seat seat = venue.getSeat(row, seatNum);
        if (!seat.isAvailable()) {
            seat.setAvailable(true);
        } else {
            throw new IllegalArgumentException("Seat is already available: " + row + seatNum);
        }
    }
}
