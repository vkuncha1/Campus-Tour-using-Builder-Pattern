package myCampusTour.myTour;

/**
 * Visiting Building
 * carbonfootprint, cost, effort, duration associated with it.
 */
public class Building implements VisitBuildingI {

    CarbonFootprintI carbonfootprintIns = new CarbonFootPrint();
    CostI costIns = new Cost();
    DurationI durationIns = new Duration();
    EffortI effortIns = new Effort();

    /**
     * To get the Carbonfootprint associated with activity.
     * @param valueIn
     * @return carbonfootprint
     */
    @Override
    public double carbonFootCal(String valueIn) {
        double co2Evaluated;
        co2Evaluated = carbonfootprintIns.getCarbonfootprint(valueIn);
        return co2Evaluated;
    }

    /**
     * To get the Cost associated with activity.
     * @param valueIn
     * @return cost
     */
    @Override
    public double costCalc(String valueIn) {
        double costEvaluated;
        costEvaluated=costIns.getCost(valueIn);
        return costEvaluated;
    }

    /**
     * To get the Duration associated with activity.
     * @param valueIn
     * @return duration
     */
    @Override
    public int durationCalc(String valueIn) {
        int durationEvaluated;
        durationEvaluated = durationIns.getDuration(valueIn);
        return durationEvaluated;
    }

    /**
     * To get the Effort associated with activity.
     * @param valueIn
     * @return effort
     */
    @Override
    public int effortCalc(String valueIn) {
        int effortEvaluated;
        effortEvaluated = effortIns.getEffort(valueIn);
        return effortEvaluated;

    }

}

