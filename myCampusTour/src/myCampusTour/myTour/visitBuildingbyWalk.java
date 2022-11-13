package myCampusTour.myTour;

public class visitBuildingbyWalk implements CarbonFootprintI,CostI,DurationI,EffortI{
    private double carbonFootPrint;
    private double cost;
    private int duration;
    private int effort;

    //constructor
    public visitBuildingbyWalk(){
        carbonFootPrint = 0.13;
        cost = 1.00;
        duration = 25;
        effort = 90;
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

