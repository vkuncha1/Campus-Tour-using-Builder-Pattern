package myCampusTour.myTour;

public class Duration implements DurationI{
    private int duration;

    public Duration(int durationIn) {
        duration = durationIn;
    }


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
    public int durationCalc(String valueIn) {
        return 0;
    }
}
