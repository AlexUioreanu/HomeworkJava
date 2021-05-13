package TemaFunctions1AlexUio;

public class SalesRepresentative extends Algo {
    private int sale;
    private int quota;
    private int revenue;

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
