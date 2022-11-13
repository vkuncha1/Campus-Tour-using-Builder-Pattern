package myCampusTour.myTour;

import myCampusTour.TourEnums.CafeteriaEnum;

public class Cafeteria implements VisitCafetiaI {
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
        if (valueIn.equals(CafeteriaEnum.CIW.name())){
            return carbonFootPrint = 0.7;
        }
        else if(valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name())){
            return carbonFootPrint = 0.6;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public double costCalc(String valueIn) {
        if (valueIn.equals(CafeteriaEnum.CIW.name())){
            return cost = 2.00;
        }
        else if(valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name())){
            return cost = 1.5;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public int duractionCalc(String valueIn) {
        if (valueIn.equals(CafeteriaEnum.CIW.name())){
            return duration = 10;
        }
        else if(valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name())){
            return duration = 15;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public int effortCalc(String valueIn) {
        if (valueIn.equals(CafeteriaEnum.CIW.name())){
            return effort = 20;
        }
        else if(valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name())){
            return effort = 35;
        }
        return 0;
    }
}
