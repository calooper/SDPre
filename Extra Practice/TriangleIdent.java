import java.util.Scanner;
import java.lang.Math;


public class TriangleIdent {
  public static void  main (String [] args) {
    Scanner scanner = new Scanner(System.in);

    //declared variables
    int sideA, sideB, sideC;
    String result = "";

    //input
    System.out.println( "Please type in side lengths of a triangle starting with side A: ");
    sideA = scanner.nextInt();
    System.out.println( "Side B: ");
    sideB = scanner.nextInt();
    System.out.println( "Side C: ");
    sideC = scanner.nextInt();

    //formula
    double angA = Math.toDegrees(Math.acos((((Math.pow(sideB,2) + Math.pow(sideC,2)) - (Math.pow(sideA,2))) / (2 * sideB * sideC))));
    double angB = Math.toDegrees(Math.acos((((Math.pow(sideC,2) + Math.pow(sideA,2)) - (Math.pow(sideB,2))) / (2 * sideA * sideC))));
    double angC = Math.toDegrees(Math.acos((((Math.pow(sideA,2) + Math.pow(sideB,2)) - (Math.pow(sideC,2))) / (2 * sideB * sideA))));

if (angA + angB + angC > 179.9 && angA + angB + angC < 180.1) { //rounding issues with Math.toDegrees
    if ( angA == 90 ||  angB == 90 || angC == 90 ) {
      result = "Right Triangle";
      }
      if ( angA == angB || angA == angC || angB == angC ) {
        result = "Isosceles Triangle";
      }
      if ( angA == angB && angC == angA ) {
        result = "Equilateral Triangle";
      }
      if ( angA < 90 && angB < 90 &&  angC < 90 && angA != angB ) {
        result = "Acute Scalene Triangle";
    }
  }
  else result = "Error: not a valid triangle" ;

  System.out.println( result);
  System.out.println( "Here are the following angles in degrees: " + "\nA = " + angA + "\nB = " + angB + "\nC = " + angC);

  }
}
