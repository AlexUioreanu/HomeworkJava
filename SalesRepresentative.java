package TemaFunctions1AlexUio;

/**
 * The class that creates the sallers
 */
public class SalesRepresentative extends Algo {
    private int sale;
    private int quota;
    private int revenue;

     /**
     * The constructor
     * @param sale that contains the number of sales he makes
     * @param quota that contains the quota he has
     */
    public SalesRepresentative(int sale, int quota) {
        this.sale = sale;
        this.quota = quota;
        this.revenue = quota*sale;
    }

    public int getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "sale=" + sale +
                ", quota=" + quota +
                ", revenue=" + revenue +
                '}';
    }
}
