public class Bottle {
    private double volume;
    private double currAmt;

    public Bottle(double v) {
        volume = v;
        currAmt = v;
    }

    public double updateAmount(double minusAmt) {
        double temp = volume * 0.25;
        currAmt -= minusAmt;
        if (currAmt < temp) {
            currAmt = volume;
        }
        return currAmt;
    }

}
