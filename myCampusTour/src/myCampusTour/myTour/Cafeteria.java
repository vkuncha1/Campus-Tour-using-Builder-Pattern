package myCampusTour.myTour;

public class Cafeteria implements CarbonFootprintI,CostI,DurationI,EffortI{
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
        if (valueIn.equals("CIW")){
            return carbonFootPrint = 0.7;
        }
        else if(valueIn.equals("MOUTAIN_VIEW")){
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
        if (valueIn.equals("CIW")){
            return cost = 2.00;
        }
        else if(valueIn.equals("MOUTAIN_VIEW")){
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
        if (valueIn.equals("CIW")){
            return duration = 10;
        }
        else if(valueIn.equals("MOUTAIN_VIEW")){
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
        if (valueIn.equals("CIW")){
            return effort = 20;
        }
        else if(valueIn.equals("MOUTAIN_VIEW")){
            return effort = 35;
        }
        return 0;
    }
}
