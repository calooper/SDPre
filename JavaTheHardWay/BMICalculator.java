import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      //declared variables
      double m, kg, bmi;

      System.out.println( "Your height in feet: " );
      int feet = keyboard.nextInt();

      System.out.println( "And inches? " );
      int inches = keyboard.nextInt();

      System.out.println( "Your weight in lbs: " );
      int lbs = keyboard.nextInt();

      //calcualtions
      m  = (feet / 3.28084) + (inches * 0.0254);
      kg = (lbs * 0.45359);
      bmi = kg / (m * m);

      System.out.println( "Your BMI is " + bmi );
   
    }
  }
