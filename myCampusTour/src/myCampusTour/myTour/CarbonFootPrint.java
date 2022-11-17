package myCampusTour.myTour;

import myCampusTour.TourEnums.CafeteriaEnum;
import myCampusTour.TourEnums.GiftEnum;
import myCampusTour.TourEnums.LectureEnum;
import myCampusTour.TourEnums.TransitEnum;

public class CarbonFootPrint implements CarbonFootprintI{
    private double carbonfootprint;

    @Override
    public String toString() {
        return "CarbonFootPrint{" +
                "carbonfootprint=" + carbonfootprint +
                '}';
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public double getCarbonfootprint(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            carbonfootprint = 2.5;
        }
        else if(valueIn.equals(TransitEnum.WALK.name())){
            carbonfootprint = 0.5;
        } else if (valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name()))
        {
            carbonfootprint =  1.9;
        } else if (valueIn.equals(CafeteriaEnum.CIW.name())) {
            carbonfootprint = 1.7;
        } else if (valueIn.equals(GiftEnum.EVENT_CENTER.name())) {
            carbonfootprint = 0.6;
        } else if (valueIn.equals(GiftEnum.UNIVERSITY_UNION.name())) {
            carbonfootprint = 0.4;
        } else if (valueIn.equals(LectureEnum.CS540.name())) {
            carbonfootprint = 0.44;
        } else if (valueIn.equals(LectureEnum.CS542.name())) {
            carbonfootprint =  0.23;
        }
        else {
            carbonfootprint = 0.0;
        }

        return carbonfootprint;
    }
}
