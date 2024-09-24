/*
 * Leon Zhang

 */

public class Circle {

    double radius;
    double pi = 3.141592653589793238462643383279502884197;
    
    public Circle() {
        radius = 1;
    }
    
    public Circle(double r) {
        radius = r;
        
    }
    
    
    public String toString() {
        return "Hello. I am a circle with a radius of " + radius;
    }
    
    public double getRadius() {
        return radius;
        
    }
    
    public double circumference() {
        return 2*pi*radius;
    }
    
    public double area() {
        return pi*radius*radius;
    }
    
    }
    
    
    