import java.util.Scanner;

public class Driver {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        OrderedPair op1, op2, op3, op4;
        Formulas f = new Formulas();
        
        
        
        op1 = new OrderedPair(0,0);
        op2 = new OrderedPair(4,2);
        
        
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:");
        System.out.print("a: ");
        double quad1 = input.nextDouble();
        System.out.print("b: ");
        double quad2 = input.nextDouble();
        System.out.print("c: ");
        double quad3 = input.nextDouble();
        System.out.println("The solutions for "+quad1+"x^2 + "+quad2+"x + "+quad3+" are ("+f.findQuadraticRoots(quad1,quad2,quad3)+").");
        
        
        System.out.println(" ");
        
        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double ex1 = input.nextDouble();
        System.out.print("y1: ");
        double why1 = input.nextDouble();
        System.out.print("x2: ");
        double ex2 = input.nextDouble();
        System.out.print("y2: ");
        double why2 = input.nextDouble();
        
        op1 = new OrderedPair(ex1,why1);
        op2 = new OrderedPair(ex2,why2);
        
        System.out.println("A line between ("+ ex1 + "," +why1+ ") and ("+ ex2 + "," +why2+ ") has a slope of " +f.findSlope(op1,op2)+".");
        
        
        System.out.println(" ");
        
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double exe1 = input.nextDouble();
        System.out.print("y1: ");
        double whyy1 = input.nextDouble();
        System.out.print("x2: ");
        double exe2 = input.nextDouble();
        System.out.print("y2: ");
        double whyy2 = input.nextDouble();
        
        op3 = new OrderedPair(exe1,whyy1);
        op4 = new OrderedPair(exe2,whyy2);
        
        System.out.println("The midpoint between ("+ exe1 + "," +whyy1+ ") and ("+ exe2 + "," +whyy2+ ") is ("+f.findMidpoint(op3,op4)+").");
        
        System.out.println(" ");
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int terms = input.nextInt();
        System.out.print("Starts with: ");
        double start = input.nextDouble();
        System.out.print("increases by: ");
        double incre = input.nextDouble();
        System.out.println("The sum of the first "+ terms +" terms of an arithmetic series that starts with " +start+" and increases by "+incre+" is "+f.findArithmeticSeriesSum(start,incre,terms)+".");
    
        System.out.println(" ");
        
        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int terms1 = input.nextInt();
        System.out.print("Starts with: ");
        double start1 = input.nextDouble();
        System.out.print("Rate of growth: ");
        double incre1 = input.nextDouble();
        System.out.println("The sum of the first "+ terms +" terms of a finite geometric series that starts with " +start1+" by a rate of "+incre1+" is "+f.findGeometricSeriesSum(start1,incre1,terms1)+".");
    
        System.out.println(" ");
        
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int dicesides = input.nextInt();
        System.out.println("Rolling a " +dicesides+ "-sided die... you got a " +f.rollDie(dicesides)+"!");
    }
    
}