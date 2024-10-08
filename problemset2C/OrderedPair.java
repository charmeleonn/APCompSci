/**
 * Leon Zhang
 * 9/27/2024
 * Problem Set 2C
 */

public class OrderedPair {
    double x;
    double y;
    
    public OrderedPair() {
        x = 0;
        y = 0;
    
    }
    
    public OrderedPair(double ex, double wy) {
        x = ex;
        y = wy;
    }

    public String toString() {
        return x + ", " + y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}