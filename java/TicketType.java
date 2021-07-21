import java.util.List;
import java.util.Random;
public enum TicketType {
        full,
        fullVip,
        freePass,
        oneDayVip,
        oneDay;

        public static TicketType randomTicket() {
        int pick = new Random().nextInt(TicketType.values().length);
        return TicketType.values()[pick];
    }

//    private static final List<TicketType> VALUES =
//            List.of(values());
//    private static final int SIZE = VALUES.size();
//    private static final Random RANDOM = new Random();
//
//    public static TicketType randomTicket()  {
//        return VALUES.get(RANDOM.nextInt(SIZE));
//    }
}
