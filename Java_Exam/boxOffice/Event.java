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
/*
 * 
 * 功能
预定指定数量 (numSeats) 和类型 (seatType) 的相邻座位。
逻辑解释
遍历所有行: 从 venue.getRows() 获取所有行，逐行检查。
检查每行的座位:
初始化变量：
consecutive: 记录当前找到的连续满足条件的座位数量。
start: 记录当前连续座位的起始索引。
遍历当前行的座位：
条件匹配: 如果座位类型符合 seatType 且座位可用 (isAvailable())，则：
如果这是新的一段连续座位，则记录起始索引。
增加 consecutive。
如果找到足够的座位 (consecutive == numSeats)，则：
将这段座位标记为已预定 (setAvailable(false)）。
返回预定总价（座位单价乘以数量）。
不匹配时: 如果遇到不满足条件的座位，重置 consecutive。
未找到座位: 如果遍历所有行后仍未找到符合条件的座位，返回 -1。
返回值
成功预定：返回总票价。
失败：返回 -1。
 */
    public void returnSeat(char row, int seatNum) {
        Seat seat = venue.getSeat(row, seatNum);
        if (!seat.isAvailable()) {
            seat.setAvailable(true);
        } else {
            throw new IllegalArgumentException("Seat is already available: " + row + seatNum);
        }
    }
}
