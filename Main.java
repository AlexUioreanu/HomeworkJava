package TemaFunctions1AlexUio;

import ierarhie.TestAnimal;

import java.util.Arrays;

public class Main extends Algo {
    public static void main(String[] args) {

        SalesRepresentative guy1 = new SalesRepresentative(10, 700, 7000);
        SalesRepresentative guy2 = new SalesRepresentative(7, 800, 5600);
        SalesRepresentative guy3 = new SalesRepresentative(8, 600, 4800);
        SalesRepresentative guy4 = new SalesRepresentative(10, 1000, 10000);
        SalesRepresentative guy5 = new SalesRepresentative(10, 800, 8000);
        SalesRepresentative[] reps = new SalesRepresentative[]{guy1, guy2, guy3, guy4, guy5};

        Algo sort = new Algo();

        SalesRepresentative[] sortedReps = sort.sort(reps);

        System.out.println(Arrays.toString(sortedReps));
    }
}

