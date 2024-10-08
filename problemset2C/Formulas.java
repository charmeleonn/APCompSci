public class Formulas {
    
    public OrderedPair findQuadraticRoots(double a, double b, double c) {
        double answer1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        double answer2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        
        OrderedPair one = new OrderedPair(answer1,answer2);
    
        return one;
    } 
    
    public double findSlope (OrderedPair A, OrderedPair B) {
        double slope = (B.getY() - A.getY())/B.getX() - A.getX();
    
        return slope;
        
    } 
    
    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double midx = (A.getX() + B.getX())/2;
        double midy = (A.getY() + B.getY())/2;
        
        OrderedPair midfin = new OrderedPair(midx,midy);
        
        return midfin;
        
        
    }
    
    public double findArithmeticSeriesSum (double a, double d, int k) {
        double sum = (k/2)*((2*a)+d*(k-1));
        
        return sum;
        
    }
    
    public double findGeometricSeriesSum (double a, double r, int k) {
        double sumgeo = a*((1-Math.pow(r,k))/(1-r));
        
        return sumgeo;
    }
    
    public int rollDie (int sides) {
        int die = (int)(Math.random()*sides) + 1;
        
        return die;
    }


    
}