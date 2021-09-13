import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class Waiter {

    public static final Restaurant restaurant = new Restaurant("BestRestaurant");
    private static final List<Costumer> costumerList = new ArrayList<>();
    public static List<Tabel> rightSortedTablesList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Restaurant BestRestaurant is ready to serve. Please add your order below:");
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    System.out.println("Application closed");
                    break;
                }
                String[] argu = line.split(" ");
                if (argu[0].equals(">>") && argu[1].equals("arrive")) {
                    String fullName = argu[3] + " " + argu[4];
                    Costumer costumer = Costumer.builder()
                            .honorific(argu[2])
                            .fullname(fullName)
                            .seats(Integer.parseInt(argu[5]))
                            .build();

//                restaurant.getListOfWaitingClients().put(costumer.getFullname(), costumer);

                    rightSortedTablesList = restaurant.getListOfTables().stream()
                            .filter(tabel -> costumer.getSeats() <= tabel.getSeats() && tabel.isEnable() == true)
                            .sorted(new Comparator<Tabel>() {
                                @Override
                                public int compare(Tabel o1, Tabel o2) {
                                    return o1.getSeats() - o2.getSeats();
                                }
                            })
                            .collect(Collectors.toList());

                    System.out.println(rightSortedTablesList);
                    System.out.println("→Hello " + costumer.getHonorific() + " " + costumer.getFullname() + " to " + restaurant.getName() + ". " + "I am going to find you a seat " +
                            "as soon as possible.");

                    if (rightSortedTablesList.size() == 0) {
                        restaurant.getListofWaitingClient().add(costumer);
                        System.out.println("→" + costumer.getHonorific() + " " + costumer.getFullname() + " I’m sorry that I could not find you a seat. Please wait some\n" +
                                "more");
                        System.out.println("→Goodbye " + costumer.getHonorific() + " " + costumer.getFullname() + ". I’m sorry that our restaurant is now full. Please come back another time.");
                    }
                    restaurant.getListofWaitingClient().add(costumer);
                    restaurant.addCostumerToTable(rightSortedTablesList, restaurant.getListofWaitingClient().get(0));

                } else if (argu[0].equals(">>") && argu[1].equals("leave")) {
                    String[] argu2 = line.split(" ");
                    String fullName = argu[2] + " " + argu[3];
                    for (Tabel table : restaurant.getTabelLists()) {
                        if (table.getSeatedCostumer() != null) {
                            if (table.getSeatedCostumer().getFullname().equalsIgnoreCase(fullName)) {
                                table.removeCostumerTable();
                            }
                        }
//                        for (Costumer costumer1 : table.getSeatedCostumer()) {
//                            if (costumer1.getFullname().equalsIgnoreCase(fullName)) {
//                                table.getSeatedCostumer().remove(costumer1);
//                                table.isFree();
//                                System.out.println("→Goodbye" + costumer1.getHonorific() + " " + costumer1.getFullname() + "I hope you enjoyed our restaurant and we will be happy to serve you anytime.");
//                            }
//                        }
                    }
                }
            } catch (ConcurrentModificationException ignored) {
            }
        }
    }
}
