import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FestivalAttendeeThread extends Thread {

    private TicketType ticketType;
    private FestivalGate festivalGate;

    public FestivalAttendeeThread(TicketType type, FestivalGate gate) throws InterruptedException {
        this.start();
        this.ticketType = type;
        this.festivalGate = gate;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticketType = TicketType.randomTicket();

    }
}
