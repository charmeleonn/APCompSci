
public class Fraction {
    
    private int numerator;
    private int denominator;
    
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    
    public Fraction(int num, int den) {
        numerator = num;
        setDenom(den);
    }
    
    public Fraction(String frac) {
        numerator = Integer.parseInt(frac.substring(0, frac.indexOf("/")));
        if (Integer.parseInt(frac.substring(frac.indexOf("/")+1)) == 0) {
            System.out.println("Error: Denominator cannot be zero");
            denominator = 1;
        } else {
            denominator = Integer.parseInt(frac.substring(frac.indexOf("/")+1)); 
        }       
    }
    
    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }
    
        
    public int GetNum() {
        return numerator;
    }

    public int GetDenom() {
        return denominator;
    }
    

    public String toString() {
        return numerator+"/"+denominator;
    }
    
    public double toDouble() {
        return (double) numerator / denominator;
    }
    
    public void reduce() {
        int factor = GCF(numerator, denominator);
        
        numerator /= factor;
        denominator /= factor;
        
    }

    public int GCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
    }
    
        
        

    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int den) {
        if (den == 0) {
            System.out.println("Error: Denominator cannot be zero");
            denominator = 1;
        } else {
            denominator = den; 
        }        
    }
    


    public static Fraction multiply(Fraction a, Fraction b) {
        int Numer = a.numerator*b.numerator;
        int Denom = a.denominator*b.denominator;
        
        return new Fraction(Numer, Denom);
    }
    

    public static Fraction divide(Fraction a, Fraction b) {
        int Numer = a.numerator*b.denominator;
        int Denom = a.denominator*b.numerator;
        
        return new Fraction(Numer, Denom);
    }
    

    public static Fraction add(Fraction a, Fraction b) {
        int denom1 = a.denominator;
        int denom2 = b.denominator;
        
        a.numerator*= denom2;
        a.denominator*= denom2;
        b.numerator*= denom1;
        b.denominator*= denom1;
        
        int cNUM = a.numerator + b.numerator;
        int cDEN = a.denominator;

        return new Fraction(cNUM, cDEN);
    }
    

    public static Fraction subtract(Fraction a, Fraction b) {
        int denom1 = a.denominator;
        int denom2 = b.denominator;
        
        a.numerator*= denom2;
        a.denominator*= denom2;
        b.numerator*= denom1;
        b.denominator*= denom1;
        
        int cNUM = a.numerator - b.numerator;
        int cDEN = a.denominator;
        
        return new Fraction(cNUM, cDEN);
    }

    public void randomize() {
        numerator = (int) (Math.random() * 9) + 1;
        denominator = (int) (Math.random() * 9) + 1;
    }
}