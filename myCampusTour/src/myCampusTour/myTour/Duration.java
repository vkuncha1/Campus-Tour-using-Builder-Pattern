package myCampusTour.myTour;

import myCampusTour.TourEnums.CafeteriaEnum;
import myCampusTour.TourEnums.GiftEnum;
import myCampusTour.TourEnums.LectureEnum;
import myCampusTour.TourEnums.TransitEnum;

public class Duration implements DurationI{
    private int duration;


    @Override
    public String toString() {
        return "Duration{" +
                "duration=" + duration +
                '}';
    }


    /**
     * @param valueIn
     * @return
     */
    @Override
    public int getDuration(String valueIn) {
        if (valueIn.equals(TransitEnum.BUS.name())){
            duration = 5;
        }
        else if(valueIn.equals(TransitEnum.WALK.name())){
            duration =15;
        } else if (valueIn.equals(CafeteriaEnum.MOUNTAIN_VIEW.name()))
        {
            duration =  5;
        } else if (valueIn.equals(CafeteriaEnum.CIW.name())) {
            duration = 30;
        } else if (valueIn.equals(GiftEnum.EVENT_CENTER.name())) {
            duration = 10;
        } else if (valueIn.equals(GiftEnum.UNIVERSITY_UNION.name())) {
            duration = 5;
        } else if (valueIn.equals(LectureEnum.CS540.name())) {
            duration = 15;
        } else if (valueIn.equals(LectureEnum.CS542.name())) {
            duration =  20;
        }
        else {
            duration = 0;
        }

        return duration;

    }
}
