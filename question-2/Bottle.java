public class Bottle {
    private double volume;
    private double amt;

    public Bottle(double v) {
        volume = v;
        amt = v;
    }

    public double updateAmount(double minusAmt) {
        double temp = volume * 0.25;
        amt -= minusAmt;
        if (amt < temp) {
            amt = volume;
        }
        return amt;
    }

}
