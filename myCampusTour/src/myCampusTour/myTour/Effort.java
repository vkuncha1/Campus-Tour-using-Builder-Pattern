package myCampusTour.myTour;

import myCampusTour.TourEnums.CafeteriaEnum;
import myCampusTour.TourEnums.GiftEnum;
import myCampusTour.TourEnums.LectureEnum;
import myCampusTour.TourEnums.TransitEnum;

public class Effort implements EffortI{
    private int effort;

    @Override
    public String toString() {
        return "Effort{" +
                "effort=" + effort +
                '}';
    }

    /**
     * Getting Effort value based on activity
     * @param valueIn
     * @return effort
     */
    @Override
    public int getEffort(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            effort =  20;
        }
        else if(valueIn.equals(TransitEnum.WALK.name())){
            effort =  70;
        } else if (valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name()))
        {
            effort =   3;
        } else if (valueIn.equals(CafeteriaEnum.CIW.name())) {
            effort =  20;
        } else if (valueIn.equals(GiftEnum.EVENT_CENTER.name())) {
            effort =  20;
        } else if (valueIn.equals(GiftEnum.UNIVERSITY_UNION.name())) {
            effort =  40;
        } else if (valueIn.equals(LectureEnum.CS540.name())) {
            effort =  20;
        } else if (valueIn.equals(LectureEnum.CS542.name())) {
            effort =   25;
        }
        else {
            effort =  0;
        }

        return effort;
    }
}
