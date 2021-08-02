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
}
