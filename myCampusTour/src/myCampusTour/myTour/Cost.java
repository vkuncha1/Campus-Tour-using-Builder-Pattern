package myCampusTour.myTour;

public class Cost implements CostI{

    private double cost;


    public Cost(double costIn) {
        cost = costIn;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public double costCalc(String valueIn) {
        return 0;
    }
    @Override
    public String toString() {
        return "Cost{" +
                "cost=" + cost +
                '}';
    }
}
