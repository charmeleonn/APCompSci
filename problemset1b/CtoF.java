import java.util.Scanner;

public class CtoF {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*** Celsius --> Fahrenheit ***");
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        double f = celsius * 9/5 + 32;
        
        System.out.println(celsius + "° Celsius = "+ f + "° Fahrenheit");
        
        System.out.println(" ");
        System.out.println("*** BMI Calculator ***");
        System.out.print("Enter a weight in kg: ");
        double kg = input.nextDouble();
        System.out.println("Enter a height in m: ");
        double h = input.nextDouble();
        double bmi = kg/(h*h);
        System.out.println("A " + h + "m tall adult who weighs " + kg + "kg has a BMI of " + bmi);
        
        System.out.println(" ");
        System.out.println("*** Days --> Weeks and Days ***");
        System.out.print("Enter a number of days: ");
        int days = input.nextInt();
        int weeks = days/7;
        int daysleft = days%7;
        System.out.println(days + " days is equal to " + weeks + " weeks, " + daysleft + " days.");
        
        System.out.println(" ");
        System.out.println("*** Receipt Generator ***");
        System.out.print("Number of units you're buying: ");
        double units = input.nextDouble();
        System.out.print("Price per unit: ");
        double price = input.nextDouble();
        System.out.print("Tax rate: ");
        double tax = input.nextDouble();
        
        double total = units * price * (tax/100+1);
        System.out.println("Purchasing " + units + " units at $" + price + " with " + tax + "% tax will cost $" + total);
        
        System.out.println(" ");
        System.out.println("*** Sum of digits ***");
        System.out.print("Enter a positive, three-digit number: ");
        int number = input.nextInt();
        int sum = number/100;
        int sum1 = (number - sum*100)/10;
        int sum2 = (number - sum*100)%10;
        int finalsum = sum + sum1 + sum2;
        System.out.print("The sum of the digits of " + number + " is " + finalsum);
    }
        
        
    }

