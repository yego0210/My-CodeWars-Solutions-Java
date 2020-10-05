

public class Multiply {
    public static Double multiply(final Double a, final Double b){         
        return (a == null || b == null) ?
                                          Double.NaN
                                          : 
                                          a * b;
    }
