package myCampusTour.myTour;

public class Building implements CarbonFootprintI,CostI,DurationI,EffortI{
    private double carbonFootPrint;
    private double cost;
    private int duration;
    private int effort;


    @Override
    public double carbonFootCal(String rideIn) {
        if (rideIn.equals("WATSON")){
            return carbonFootPrint = 2.5;
        }
        else if(rideIn.equals ("ITC")){
            return carbonFootPrint = 0.5;
        }
        return 0;
    }

    @Override
    public double costCalc(String rideIn) {
        if (rideIn.equals("WATSON")){
            return cost = 3.00;
        }
        else if(rideIn.equals ("ITC")){
            return cost = 1.00;
        }
        return 0;
    }

    @Override
    public int duractionCalc(String rideIn) {
        if (rideIn.equals("WATSON")){
            return duration = 5;
        }
        else if(rideIn.equals ("ITC")){
            return duration = 15;
        }
        return 0;
    }

    @Override
    public int effortCalc(String rideIn) {
        if (rideIn.equals("WATSON")){
            return effort = 20;
        }
        else if(rideIn.equals ("ITC")){
            return effort = 70;
        }
        return 0;
    }

}

