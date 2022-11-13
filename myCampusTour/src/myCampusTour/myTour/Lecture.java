package myCampusTour.myTour;

public class Lecture implements CarbonFootprintI,CostI,DurationI,EffortI{
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
        if (valueIn.equals("CS542")){
            return carbonFootPrint = 0.23;
        }
        else if(valueIn.equals("CS540")){
            return carbonFootPrint = 0.44;
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public double costCalc(String valueIn) {
        if (valueIn.equals("CS542")){
            return cost = 20;
        }
        else if(valueIn.equals("CS540")){
            return cost = 20 + (0.1*(20));
        }
        return 0;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public int duractionCalc(String valueIn) {
        if (valueIn.equals("CS542")){
            return duration = 20;
        }
        else if(valueIn.equals("CS540")){
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
        if (valueIn.equals("CS542")){
            return effort = 25;
        }
        else if(valueIn.equals("CS540")){
            return effort = 5;
        }
        return 0;
    }
}
