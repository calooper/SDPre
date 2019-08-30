import java.util.Scanner;
import java.lang.Math.*;

public class TireRotationsPerSec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //declared variables
    double wheelDiam, revsSec, revsMile, speed, circumference, tireWidth, aspectRat, rimSize;

    System.out.println( "Please enter the size of your vehicle tires - starting with the first number (e.g. '245' in 245/45/18)");
    tireWidth = scanner.nextDouble();//width of tired, used to calculate sidewall height in the next line

    System.out.println( "Please enter the second number of your vehicle tires: ") ;
    aspectRat = scanner.nextDouble();//middle number which represents sidewall height - found as a % ratio of the width

    System.out.println( "Please enter the third number of your vehicle tires: ");
    rimSize   = scanner.nextDouble();// last number which is rim diameter in inches


    //formula - need to find aspect ration of tire height total diameter of wheel so that the circumference can be calculated
    wheelDiam = (tireWidth / 25.4 ) * (aspectRat / 50 ) + (rimSize ); //diameter in inches
    circumference = (wheelDiam / 2) * (Math.PI * 2);
    revsMile   = (5280 * 12) / (circumference); // Mile / 2 * PI * radius

    System.out.println( "The diamter in inches of your wheels is " + wheelDiam );
    System.out.println( "The revolutions per mile is " + revsMile);

    System.out.print( "\nPlease enter the speed in MPH in which you wish to see the revolutions per second: ");
    speed = scanner.nextDouble();

    revsSec = ((speed * 5280 / (3600)) * (12) /  (circumference));
    System.out.println( "The revolutions per second at " + speed + " MPH is " + revsSec );

  }
}
