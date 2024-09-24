public class Driver {
    public static void main (String[] args) {
        Circle c1, c2;
        
        Cylinder b1, b2;
        
        c1 = new Circle();
        c2 = new Circle(5);
        
        b1 = new Cylinder();
        b2 = new Cylinder(5,5);
        
        System.out.println("Creating a circle with a the default constructor");
        System.out.println(c1);
        System.out.println("getRadius() --> " + c1.getRadius() + " units");
        System.out.println("circumference() --> " + c1.circumference() + " units");
        System.out.println("area() --> " + c1.area() + " units^2");
        
        
        System.out.println(" ");
        
        System.out.println("Creating a circle with a the paramatized constructor");
        System.out.println(c2);
        System.out.println("getRadius() --> " + c2.getRadius() + " units");
        System.out.println("circumference() --> " + c2.circumference() + " units");
        System.out.println("area() --> " + c2.area() + " units^2");
        
        System.out.println(" ");
        System.out.println("Creating a cylinder with the default constructor!");
        
        System.out.println(b1);
        System.out.println("getRadius() --> " + b1.getRadius() + " units");
        System.out.println("getHeight() --> " + b1.getHeight() + " units");
        System.out.println("surfaceArea() --> " + b1.surfaceArea() + " units^2");
        System.out.println("volume() --> " + b1.volume() + " units^3");
        
        System.out.println(" ");
        System.out.println("Creating a cylinder with the paramatized constructor!");
        System.out.println(b2);
        System.out.println("getRadius() --> " + b2.getRadius() + " units");
        System.out.println("getHeight() --> " + b2.getHeight() + " units");
        System.out.println("surfaceArea() --> " + b2.surfaceArea() + " units^2");
        System.out.println("volume() --> " + b2.volume() + " units^3");
    }
}