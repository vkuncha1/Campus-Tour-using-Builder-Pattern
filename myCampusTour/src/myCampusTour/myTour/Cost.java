package myCampusTour.myTour;

import myCampusTour.TourEnums.CafeteriaEnum;
import myCampusTour.TourEnums.GiftEnum;
import myCampusTour.TourEnums.LectureEnum;
import myCampusTour.TourEnums.TransitEnum;

public class Cost implements CostI{
    private double cost;


    @Override
    public String toString() {
        return "Cost{" +
                "Cost=" + cost +
                '}';
    }

    /**
     * Getting Cost value based on activity
     * @param valueIn
     * @return cost
     */
    @Override
    public double getCost(String valueIn){
        if (valueIn.equals(TransitEnum.BUS.name())){
            cost = 3.0;
        }
        else if(valueIn.equals(TransitEnum.WALK.name())){
            cost = 1.0;
        } else if (valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name()))
        {
            cost =  2.00 + (0.05*2.00);
        } else if (valueIn.equals(CafeteriaEnum.CIW.name())){
            cost = 2.00;
        } else if (valueIn.equals(GiftEnum.EVENT_CENTER.name())){
            cost = 0.2;
        } else if (valueIn.equals(GiftEnum.UNIVERSITY_UNION.name())){
            cost = 0.4;
        } else if (valueIn.equals(LectureEnum.CS540.name())){
            cost = 20;
        } else if (valueIn.equals(LectureEnum.CS542.name())){
            cost =  20 + (0.1*(20));
        }
        else {
            cost = 0.0;
        }

        return cost;
    }
}
