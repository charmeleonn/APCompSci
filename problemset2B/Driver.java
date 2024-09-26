import java.util.Scanner;

class Driver {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();

System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character: ");
      String answer1 = input.nextLine();
    System.out.println("The last letter is " + sTools.lastLetter(answer1));
System.out.println("---------------------");


System.out.println("FormatNumber test cases:");
      System.out.println("Enter a 10-digit number: ");
      String answer2 = input.nextLine();
    System.out.println("The formatted number is: " + sTools.formatPhoneNumber(answer2));
System.out.println("---------------------");

System.out.println("middleThree test cases:");
      System.out.println("Enter an odd-numbered word: ");
      String answer3 = input.nextLine();
    System.out.println("The formatted number is: " + sTools.middleThree(answer3));
System.out.println("---------------------");

System.out.println("swapLastTwo test cases:");
      System.out.println("Enter a word with at least two characters: ");
      String answer4 = input.nextLine();
    System.out.println("The new word is: " + sTools.swapLastTwo(answer4));
System.out.println("---------------------");

System.out.println("frontAgain test cases:");
      System.out.println("Enter a word with at least two characters: ");
      String answer5 = input.nextLine();
      int answer5b = input.nextInt();
      
    System.out.println("The front " + answer5b + " letters is repeated in the back?: " + sTools.frontAgain(answer5,answer5b));
System.out.println("---------------------");

   }
}
