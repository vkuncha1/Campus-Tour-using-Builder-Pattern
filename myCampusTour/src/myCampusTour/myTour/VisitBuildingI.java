package myCampusTour.myTour;

public interface VisitBuildingI extends CarbonFootprintI,CostI,DurationI,EffortI{
    double carbonFootCal(String valueIn);
    public double costCalc(String valueIn);
    public int effortCalc(String valueIn);
    public int duractionCalc(String valueIn);
}
