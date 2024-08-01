public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarTotal(double dollarPrice, double dollarDesire){
        return dollarPrice*dollarDesire * (1.00 + IOF);
    }

}
