package myCampusTour.myTour;

/**
 * Attending Lecture interface
 * carbonfootprint, cost, effort, duration associated with it.
 */
public interface AttendLectureI {
    public double carbonFootCal(String valueIn);
    public double costCalc(String valueIn);
    public int effortCalc(String valueIn);
    public int durationCalc(String valueIn);
}
