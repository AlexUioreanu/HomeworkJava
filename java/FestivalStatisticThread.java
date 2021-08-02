import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FestivalStatisticThread extends Thread {

    private FestivalGate gate;

    public FestivalStatisticThread(FestivalGate gate) throws InterruptedException {
        this.join();
        this.gate = gate;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(gate.getListTicketData().size() + "---> people entered<----");
            System.out.println(gate.getFull().size() + " people have full tickets");
            System.out.println(gate.getFree().size() + " have free passes");
            System.out.println(gate.getFullVip().size() + " have full VIP passes");
            System.out.println(gate.getOneDay().size() + " have one-day passes");
            System.out.println(gate.getOneDayVip().size() + " have one-day VIP passes");

        } while (FestivalGate.mainGate.isAlive());
    }
}
