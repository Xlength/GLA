package boxOffice;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. 创建场馆配置字符串
        String venueConfig = "3\n" +
                             "S D D S\n" +
                             "D D D\n" +
                             "S S S S S S";

        // 2. 创建 Venue 对象
        Venue venue = new Venue(venueConfig);

        // 3. 定义票价结构
        Map<SeatType, Integer> priceStructure = new HashMap<>();
        priceStructure.put(SeatType.STANDARD, 10);
        priceStructure.put(SeatType.DELUXE, 20);

        // 4. 创建 Event 对象
        Event event = new Event(venue, priceStructure);

        // 5. 打印场馆座位详情
        System.out.println("Initial Venue Details:");
        venue.printDetails();

        // 6. 尝试预定座位
        System.out.println("\nAttempting to reserve 2 Deluxe seats...");
        int price = event.reserveSeats(2, SeatType.DELUXE);
        if (price != -1) {
            System.out.println("Reservation successful! Total price: £" + price);
        } else {
            System.out.println("Reservation failed. Not enough seats available.");
        }

        // 7. 再次打印场馆座位详情
        System.out.println("\nVenue Details After Reservation:");
        venue.printDetails();

        // 8. 退还座位
        System.out.println("\nReturning seat B1...");
        event.returnSeat('B', 1);

        // 9. 打印场馆座位详情
        System.out.println("\nVenue Details After Returning Seat:");
        venue.printDetails();

        // 10. 尝试预定超过可用数量的座位
        System.out.println("\nAttempting to reserve 5 Standard seats...");
        price = event.reserveSeats(5, SeatType.STANDARD);
        if (price != -1) {
            System.out.println("Reservation successful! Total price: £" + price);
        } else {
            System.out.println("Reservation failed. Not enough seats available.");
        }
    }
}
