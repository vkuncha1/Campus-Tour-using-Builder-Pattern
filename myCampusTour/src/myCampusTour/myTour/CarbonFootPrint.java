package myCampusTour.myTour;

public class CarbonFootPrint implements CarbonFootprintI{
    private float carbonfootprint;

    public CarbonFootPrint(float carbonfootprintIn) {
        carbonfootprint = carbonfootprintIn;
    }

    public float getCarbonfootprint() {
        return carbonfootprint;
    }

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
    public double carbonFootCal(String valueIn) {
        return 0;
    }
}
