package myCampusTour.myTour;

public class Gift implements PickGiftI{
    CarbonFootprintI carbonfootprintIns = new CarbonFootPrint();
    CostI costIns = new Cost();
    DurationI durationIns = new Duration();
    EffortI effortIns = new Effort();

    /**
     * @param valueIn
     * @return
     */
    @Override
    public double carbonFootCal(String valueIn) {
        double co2Evaluated;
        co2Evaluated = carbonfootprintIns.getCarbonfootprint(valueIn);
        return co2Evaluated;
    }

    @Override
    public double costCalc(String valueIn) {
        double costEvaluated;
        costEvaluated=costIns.getCost(valueIn);
        return costEvaluated;
    }

    @Override
    public int durationCalc(String valueIn) {
        int durationEvaluated;
        durationEvaluated = durationIns.getDuration(valueIn);
        return durationEvaluated;
    }

    @Override
    public int effortCalc(String valueIn) {
        int effortEvaluated;
        effortEvaluated = effortIns.getEffort(valueIn);
        return effortEvaluated;

    }

}
