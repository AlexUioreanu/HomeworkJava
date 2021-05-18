package TemaFunctions1AlexUio;

import java.util.Arrays;
/**
 * Class that contains the function that sort
 */
public class Algo {
    
    /**
     *Method that sort descending
     * @param representatives contains the list that will be sorted
     * @return the new list sorted
     */
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
