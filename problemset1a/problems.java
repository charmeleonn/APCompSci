import java.util.Scanner;

public class problems {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favourite course? ");
        String course = input.nextLine();
        System.out.print("What is your favourite show? ");
        String show = input.nextLine();
        System.out.print("How many hours do you spend doing homework? ");
        int homework = input.nextInt();
        System.out.print("How many hours do you goof around? ");
        int goof = input.nextInt();
        System.out.println("Your favourite course is " + course);
        System.out.println("Your favourite show is " + show);
        System.out.println("Your spend " + homework + " hours doing homework");
        System.out.println("Your spend " + goof + " goofing around");
        System.out.println("In total you spend " + (goof + homework) + " doing stuff");
        input.close();
    }
}