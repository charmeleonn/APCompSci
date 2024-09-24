public class Cylinder {
    
    double height;
    Circle base; 
    double pi = 3.141592653589793238462643383279502884197;
    
    public Cylinder() {
        height = 1;
        base = new Circle();
    }
    
    public Cylinder(double r, double h) {
        height = h;
        base = new Circle(r);
    }
    
    public String toString() {
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and a height of " + height;
        
    }
    
    public double getRadius() {
        return base.getRadius();
        
    }
    
    public double getHeight() {
        return height;
        
    }
    
    public double surfaceArea() {
        return base.area()*2+(height*base.circumference());
        
    }

    public double volume() {
        return base.area()*height;
    }
    
}