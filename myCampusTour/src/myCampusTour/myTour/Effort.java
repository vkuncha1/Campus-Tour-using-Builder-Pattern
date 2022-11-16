package myCampusTour.myTour;

public class Effort implements EffortI{
    private int effort;

    public Effort(int effortIn) {
        effort = effortIn;
    }

    /**
     * @param valueIn
     * @return
     */
    @Override
    public int effortCalc(String valueIn) {
        return 0;
    }

    @Override
    public String toString() {
        return "Effort{" +
                "effort=" + effort +
                '}';
    }
}
