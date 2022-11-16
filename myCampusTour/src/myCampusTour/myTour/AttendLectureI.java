package myCampusTour.myTour;

public interface AttendLectureI extends CarbonFootprintI,CostI,DurationI,EffortI{
    public double carbonFootCal(String valueIn);
    public double costCalc(String valueIn);
    public int effortCalc(String valueIn);
    public int durationCalc(String valueIn);
}
