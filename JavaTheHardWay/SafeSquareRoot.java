import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double x, y;
      String ready = "yes";

      System.out.print( "Give me a number and I will give you its square root. " );
      System.out.println( "Are you ready!?");
      ready = keyboard.nextLine();

      while (! ready.equals("yes")){
        System.out.println( "Alright, well I will ask you again!");
        System.out.println( "Are you ready!?");
        ready = keyboard.nextLine();
      }

      System.out.print( "Okay, go! (No negatives, please) ");
      x = keyboard.nextInt();

      while (x < 0 ) {
        System.out.println( "I won't take the square root of a negative.\nNew Number: ");
        x = keyboard.nextInt();
      }

      y = Math.sqrt(x);

      System.out.println( "The square root of " + x + " is " + y );
        
    }
  }
