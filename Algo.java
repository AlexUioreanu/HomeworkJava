package TemaFunctions1AlexUio;

import java.util.Arrays;

public class Algo {

    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
        for (int a = 1; a < reps.length; a++) {
            boolean isSorted = true;
            for (int b = 0; b < reps.length - a; b++) {
                if (reps[b].getRevenue() < reps[b + 1].getRevenue()) {
                    SalesRepresentative temp = reps[b];
                    reps[b] = reps[b + 1];
                    reps[b + 1] = temp;
                    isSorted = false;
                }
                if (isSorted)
                    return reps;
            }
        }
        return reps;
    }
}
