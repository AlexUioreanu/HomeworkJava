package TemaFunctions1AlexUio;

public class SalesRepresentative extends Algo {
    private int sale;
    private int quota;
    private int revenue = sale * quota;

    public SalesRepresentative(int sale, int quota, int revenue) {
        this.sale = sale;
        this.quota = quota;
        this.revenue = revenue;
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