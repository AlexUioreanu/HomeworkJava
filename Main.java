package TemaFunctions1AlexUio;

public class Main {
    public static void main(String[] args) {

        //A list that contains all the sellers
        SalesRepresentative[] reps = reps();
        //An object created to use the non-static methods
        Main bubbleSort = new Main();
        //A new list of SaleRepresentative that contains the last list sorted
        SalesRepresentative[] sortedReps = bubbleSort.sort(reps);

    }

    /**
     * Method that creates the list of  sellers
     *
     * @return the list of sellers
     */
    public static SalesRepresentative[] reps() {
        SalesRepresentative guy1 = new SalesRepresentative(10, 700);
        SalesRepresentative guy2 = new SalesRepresentative(7, 800);
        SalesRepresentative guy3 = new SalesRepresentative(8, 600);
        SalesRepresentative guy4 = new SalesRepresentative(10, 1000);
        SalesRepresentative guy5 = new SalesRepresentative(10, 800);

        SalesRepresentative[] reps = new SalesRepresentative[]{guy1, guy2, guy3, guy4, guy5};
        return reps;
    }


    /**
     * Method that sort descending
     *
     * @param reps contains the list that will be sorted
     * @return the new list sorted
     */
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
        int swap = 0;
        do {
            swap = 0;
            for (int i = 0; i < reps.length - 1; i++) {
                SalesRepresentative tmp = reps[i];
                int revenue = reps[i].getRevenue();
                int revenuePlus = reps[i + 1].getRevenue();
                if (revenue < revenuePlus) {
                    reps[i] = reps[i + 1];
                    reps[i + 1] = tmp;
                    swap++;
                }
            }
        } while (swap > 0);
        System.out.print("\nSorted: ");
        for (int i = 0; i < reps.length; i++)
            System.out.print("\n" + reps[i]);

        return reps;
    }
}


