package myCampusTour.myTour;

/**
 * Picking Gift interface
 * carbonfootprint, cost, effort, duration associated with it.
 */
public interface PickGiftI {
    double carbonFootCal(String valueIn);
    public double costCalc(String valueIn);
    public int effortCalc(String valueIn);
    public int durationCalc(String valueIn);
}
