package TemaFunctions1AlexUio;

import ierarhie.TestAnimal;

import java.util.Arrays;

public class Main extends Algo {
    public static void main(String[] args) {

        SalesRepresentative[] reps = getSalesRepresentatives();

        Algo sort = new Algo();

        SalesRepresentative[] sortedReps = sort.sort(reps);

        System.out.println(Arrays.toString(sortedReps));
    }
    
     /**
     * Method that creates the list of  sellers
     * @return the list of sellers
     */
    public static SalesRepresentative[] getSalesRepresentatives() {
        SalesRepresentative guy1 = new SalesRepresentative(10, 700);
        SalesRepresentative guy2 = new SalesRepresentative(7, 800);
        SalesRepresentative guy3 = new SalesRepresentative(8, 600);
        SalesRepresentative guy4 = new SalesRepresentative(10, 1000);
        SalesRepresentative guy5 = new SalesRepresentative(10, 800);

        SalesRepresentative[] reps = new SalesRepresentative[]{guy1, guy2,guy3,guy4,guy5};
        return reps;
    }
}

