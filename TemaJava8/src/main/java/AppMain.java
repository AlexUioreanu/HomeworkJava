
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class AppMain {
    List<Persoane> persoaneList;
    Set<Persoane> persoaneOrderdList;

    public AppMain() {
        persoaneList = new ArrayList<>();
    }

    public void displayPers() {
        for (Persoane persoane : persoaneList) {
            System.out.println(persoane);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AppMain appMain = new AppMain();
        appMain.copyPersoane("src/main/resources/Persoane.txt");
        appMain.displayPers();
        appMain.orderdByMonthStream(1);

    }

    public void orderdByMonthStream(int month) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/main/resources/PersoaneOrderd.txt")));
        List<Persoane> persoaneListed = persoaneList
                .stream()
                .filter(persoane -> {
                    validateMonth(month);
                    return persoane.getMonthValue() == month;
                })
                .sorted(Comparator.comparing(Persoane::getFirstName))
                .collect(Collectors.toList());

        bufferedWriter.write(String.valueOf(persoaneListed));
        bufferedWriter.close();
    }

    public static void validateMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month does not exist in the calendar!");
        }
    }

    public void copyPersoane(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            Persoane persoane = retrivePersoane(line);
            persoaneList.add(persoane);
        }
    }

    private Persoane retrivePersoane(String line) {
        Persoane persoane = new Persoane();

        Scanner s = new Scanner(line);
        s.useDelimiter(" ");
        if (s.hasNext()) {
            persoane.setFirstName(s.next());
            persoane.setLastName(s.next());
            persoane.setDateBirth(s.next());
            persoane.setMonthValue();
        }
        return persoane;
    }


    public void orderByMonth(int month) throws IOException {
        validateMonth(month);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/main/resources/PersoaneOrderd.txt")));
        persoaneOrderdList = new TreeSet<>(new Comparator<Persoane>() {
            @Override
            public int compare(Persoane o1, Persoane o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        for (Persoane persoane : persoaneList) {
            if (month == persoane.getMonthValue()) {
                persoaneOrderdList.add(persoane);
            }
        }
        for (Persoane persoane : persoaneOrderdList) {
            System.out.println("Persons that are in the same month orderd alphabetically: " + persoane);
        }
        bufferedWriter.write(String.valueOf(AppMain.this.persoaneOrderdList));
        bufferedWriter.close();
    }
}
