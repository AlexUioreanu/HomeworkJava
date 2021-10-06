import lombok.*;

import java.util.Timer;
import java.util.TimerTask;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Tabel {
    private String name;
    private int seats;
    private Costumer seatedCostumer;
    private boolean enable = true;
    private Timer timer;
    private TimerTask task;

    public Tabel(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public void addCostumerTable(Costumer costumer) {
        seatedCostumer = costumer;
        if (!(seatedCostumer == null)) {
            isOccupaid();
        }
    }

    public void removeCostumerTable() {
        System.out.println("Goodbye " + seatedCostumer.getHonorific() + " " + seatedCostumer.getFullname() + " I hope you enjoyed our restaurant and we will be happy to serve you anytime.");
        seatedCostumer = null;
        enable = false;
        this.timer = new Timer();
        this.task = new TimerTask() {
            @Override
            public void run() {
                enable = true;
            }
        };
        timer.schedule(task, 600000);
    }

    public boolean isOccupaid() {
        return enable = false;
    }

    public boolean isFree() {
        return enable = true;
    }

//    public void getNameOfSeatedCostumer() {
//        List<String> nameOfCostumer = seatedCostumer.stream().map(Costumer::getFullname).collect(Collectors.toList());
//    }
}
