package myCampusTour.myTour;

public class CarbonFootPrint implements CarbonFootprintI{
    private double carbonfootprint;

    public CarbonFootPrint(double carbonfootprintIn) {
        carbonfootprint = carbonfootprintIn;
    }

    public double getCarbonfootprint() {
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
