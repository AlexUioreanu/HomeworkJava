package TemaFunctions1AlexUio;

import java.util.Arrays;

public class Algo {

    public SalesRepresentative[] sort(SalesRepresentative[] representatives){
        Arrays.sort(representatives, new Comparator<SalesRepresentative>() {
            @Override
            public int compare(SalesRepresentative o1, SalesRepresentative o2) {
                return o2.getRevenue()- o1.getRevenue();
            }
        });
        return representatives;
    }
}
