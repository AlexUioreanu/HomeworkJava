import lombok.Getter;

import java.util.*;

@Getter
public class Restaurant {
    private final String name;
    private Tabel tabelw7;
    private Tabel tabel1w3;
    private Tabel tabel2w7;
    private Tabel tabel3w5;
    private Tabel tabel4w4;
    private Tabel tabel5w4;
    private Tabel tabel6w9;
    private Tabel tabel7w12;
    private final List<Tabel> listOfTables = new LinkedList<>();
//    private  ArrayList<Tabel> listOfFreeTables;
    private List<Tabel> listOfOccupiedTables;
    private List<Tabel> listOfTablesUndeCleanup;
    private ArrayList<Costumer> listofWaitingClient;

    Restaurant(String name) {
        this.name = name;
        listOfTables.add(tabelw7 = new Tabel("tablew", 7));
        listOfTables.add(tabel1w3 = new Tabel("tabel1w3", 3));
        listOfTables.add(tabel2w7 = new Tabel("tabel2w7", 7));
        listOfTables.add(tabel3w5 = new Tabel("tabel3w5", 5));
        listOfTables.add(tabel4w4 = new Tabel("tabel4w4", 4));
        listOfTables.add(tabel5w4 = new Tabel("tabel5w4", 4));
        listOfTables.add(tabel6w9 = new Tabel("tabel6w9", 9));
        listOfTables.add(tabel7w12 = new Tabel("tabel7w12", 12));
        this.listofWaitingClient=new ArrayList<>();
        this.listOfOccupiedTables = new ArrayList<>();
        this.listOfTablesUndeCleanup = new ArrayList<>();
    }

    public void addCostumerToTable(List<Tabel> tabelLists, Costumer costumer) {
        for (Tabel tabel : tabelLists) {
            if (tabel.isEnable()==true) {
                tabel.addCostumerTable(costumer);
                System.out.println("→Hello " + costumer.getHonorific() + " " + costumer.getFullname() + "  > I’m pleased to have found a free table for you and your\n" +
                        "guest. The waiter will take you to table number " + tabel.getName());
                break;
            }
        }
    }

    public List<Tabel> getTabelLists() {
        return listOfTables;
    }
    public String getName() {
        return name;
    }
}
