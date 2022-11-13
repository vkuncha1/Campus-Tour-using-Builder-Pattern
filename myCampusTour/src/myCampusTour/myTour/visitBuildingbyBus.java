package myCampusTour.myTour;

public class visitBuildingbyBus implements CarbonFootprintI,CostI,DurationI,EffortI{
    private double carbonFootPrint;
    private double cost;
    private int duration;
    private int effort;

    //constructor
    public visitBuildingbyBus(){
        carbonFootPrint = 1.11;
        cost = 3.00;
        duration = 10;
        effort = 11;
    }

    @Override
    public double carbonFootCal() {
        return carbonFootPrint;
    }

    @Override
    public double costCalc() {
        return cost;
    }

    @Override
    public int duractionCalc() {
        return duration;
    }

    @Override
    public int effortCalc() {
        return effort;
    }
}

