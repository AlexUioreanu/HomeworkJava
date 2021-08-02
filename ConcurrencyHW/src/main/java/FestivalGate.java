import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FestivalGate {
    public static Thread mainGate = Thread.currentThread();

    public static final Queue<TicketType> listTicketData = new ConcurrentLinkedQueue<>();

    public int nebuniaUntold = new Random().nextInt(400000);

    private final List<TicketType> full = new LinkedList<>();
    private final List<TicketType> free = new LinkedList<>();
    private final List<TicketType> fullVip = new LinkedList<>();
    private final List<TicketType> oneDay = new LinkedList<>();
    private final List<TicketType> oneDayVip = new LinkedList<>();

    public Queue<TicketType> getListTicketData() {
        return listTicketData;
    }


    public static void main(String[] args) throws InterruptedException {
        FestivalGate gate = new FestivalGate();
        FestivalStatisticThread festivalStatisticThread = new FestivalStatisticThread(gate);
        festivalStatisticThread.start();
        gate.generateAttendees(gate);
    }

    private void generateAttendees(FestivalGate gate) throws InterruptedException {
        for (int i = 1; i <= gate.nebuniaUntold; i++) {
            Thread.sleep(1);
            TicketType ticketType = TicketType.randomTicket();
            FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(ticketType, gate);
            listTicketData.add(festivalAttendeeThread.getTicketType());
            switch (ticketType) {
                case full -> full.add(ticketType);
                case freePass -> free.add(ticketType);
                case fullVip -> fullVip.add(ticketType);
                case oneDay -> oneDay.add(ticketType);
                case oneDayVip -> oneDayVip.add(ticketType);
            }
        }
    }

    public List<TicketType> getFull() {
        return full;
    }

    public List<TicketType> getFree() {
        return free;
    }

    public List<TicketType> getFullVip() {
        return fullVip;
    }

    public List<TicketType> getOneDay() {
        return oneDay;
    }

    public List<TicketType> getOneDayVip() {
        return oneDayVip;
    }
}

