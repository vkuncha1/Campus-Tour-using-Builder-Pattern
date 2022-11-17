package myCampusTour.myTour;

import myCampusTour.TourEnums.BuildingEnum;
import myCampusTour.TourEnums.TransitEnum;

public class Building implements VisitBuildingI {
    private double carbonFootPrint;
    private double cost;
    private int duration;
    private int effort;



    /**
     * @param valueIn
     * @return
     */
    @Override
    public double carbonFootCal(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            return carbonFootPrint = 2.5;
        }
        else if(valueIn.equals (TransitEnum.WALK.name())){
            return carbonFootPrint = 0.5;
        }
        return 0;
    }

    @Override
    public double costCalc(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            return cost = 3.00;
        }
        else if(valueIn.equals (TransitEnum.WALK.name())){
            return cost = 1.00;
        }
        return 0;
    }

    @Override
    public int durationCalc(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            return duration = 5;
        }
        else if(valueIn.equals (TransitEnum.WALK.name())){
            return duration = 15;
        }
        return 0;
    }

    @Override
    public int effortCalc(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            return effort = 20;
        }
        else if(valueIn.equals (TransitEnum.WALK.name())){
            return effort = 70;
        }
        return 0;
    }

}

