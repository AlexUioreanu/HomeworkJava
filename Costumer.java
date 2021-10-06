import lombok.*;
import lombok.experimental.Helper;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


@ToString
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Costumer {
    private String honorific;
    private String fullname;
    private int seats;
    private Tabel tableOuccupied;
    private Timer timer;
    private TimerTask task;
    private Date dateCome = new Date(System.currentTimeMillis());
    private LocalDateTime localDateTime = LocalDateTime.now();
    private Calendar calendar;

    public Costumer(String honorific, String fullname, int seats, Tabel tableOuccupied) {
        this.honorific = honorific;
        this.fullname = fullname;
        this.seats = seats;
        this.tableOuccupied = tableOuccupied;

        this.timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                for (Tabel table : Waiter.rightSortedTablesList) {
                    for (Costumer costumer : Waiter.restaurant.getListofWaitingClient()) {
                        if (Waiter.rightSortedTablesList.size() > 0) {
//                            for (Costumer costumer : Waiter.restaurant.getListofWaitingClient()) {
                                table.addCostumerTable(costumer);
                                Waiter.restaurant.getListofWaitingClient().remove(costumer);
//                            }
                        } else {
                            Waiter.restaurant.getListofWaitingClient().remove(costumer);
                            System.out.println("→Goodbye "+ costumer.getHonorific() + " " + costumer.getFullname() + ". I’m sorry that our restaurant is now full. Please come back another time.");
                        }
                    }
                }
            }
        };
        timer.schedule(task, 600000);
    }


    void addTableOccupied(Tabel table) {
        tableOuccupied = table;
    }
}
