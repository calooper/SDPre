import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      //declared variables
      double m, kg, bmi;

      System.out.println( "Type your height in feet: " );
      int feet = keyboard.nextInt();

      System.out.println( "And inches? " );
      int inches = keyboard.nextInt();

      System.out.println( "Your weight in lbs: " );
      int lbs = keyboard.nextInt();

      //calcualtions
      m  = (feet / 3.28084) + (inches * 0.0254);
      kg = (lbs * 0.45359);
      bmi = kg / (m * m);

      System.out.print( "BMI Category: " );
      if ( bmi  < 15.0 ) {
        System.out.println( "very severely underweight " );
      }
      else if (bmi < 16.0 ) {
        System.out.println( "severely underweight " );
      }
      else if ( bmi < 18.5 ) {
        System.out.println( "underweight " );
      }
      else if ( bmi < 25.0 ) {
        System.out.println( "normal weight " );
      }
      else if ( bmi < 30.0 ) {
        System.out.println( "overweight " );
      }
      else if ( bmi < 35.0 ) {
        System.out.println( "moderately obese " );
      }
      else if ( bmi < 40.0 ) {
        System.out.println( "severely obese " );
      }
      else {
        System.out.println( "very severely obese/\"morbidly\" obese " );
      }
    }
  }
