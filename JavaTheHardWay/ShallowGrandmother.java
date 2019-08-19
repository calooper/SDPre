import java.util.Scanner;

public class ShallowGrandmother {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      int age, happiness;
      double income, cute;
      boolean allowed;

      System.out.println( "Enter your age: " );
      age = keyboard.nextInt();

      System.out.println( "Enter your yearly income: " );
      income = keyboard.nextDouble();

      System.out.println( "How cute are you, on a scale from 0.0 to 10.0? " );
      cute = keyboard.nextDouble();

      System.out.println( "How happy do you make her, on a sclale 1 to 10? ");
      happiness = keyboard.nextInt();


      allowed = ( happiness >= 7 && age > 25 && age < 40 && (income > 50000 || cute >= 8.5 ) );

      System.out.println( "Allowed to date my grandchild? " + allowed );
    }
  }
