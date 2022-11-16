package myCampusTour.myTour;

public class Gift implements PickGiftI{
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
        if (valueIn.equals("EVENT_CENTER")){
            return carbonFootPrint = 0.2;
        } else if (valueIn.equals("UNIVERSITY_UNION")) {
            return carbonFootPrint = 0.4;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public double costCalc(String valueIn) {
        if (valueIn.equals("EVENT_CENTER")){
            return cost = 0.2;
        } else if (valueIn.equals("UNIVERSITY_UNION")) {
            return cost = 0.4;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public int durationCalc(String valueIn) {
        if (valueIn.equals("EVENT_CENTER")){
            return duration = 10;
        } else if (valueIn.equals("UNIVERSITY_UNION")) {
            return duration = 5;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public int effortCalc(String valueIn) {
        if (valueIn.equals("EVENT_CENTER")){
            return effort = 20;
        } else if (valueIn.equals("UNIVERSITY_UNION")) {
            return effort = 40;
        }
        return 0;
    }
}
