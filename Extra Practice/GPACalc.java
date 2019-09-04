import java.util.Scanner;
import java.lang.Math.*;

public class GPACalc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //variables
    String letterGrade;
    double currCredits, currClasses, cumuGPA, cumuHours, currGrade, hoursSum, totalGradePoints, totalHours;
    currGrade = 0;
    hoursSum = 0;
    cumuHours = 0;
    totalGradePoints = 0;
    totalHours = 0;

    //inputs
    System.out.println( "Please type in your current cumalative GPA; if only wanting GPA for this semester please type 0: ");
    cumuGPA = scanner.nextDouble();

    if (cumuGPA != 0) {
      System.out.println( "Please type in the cumulative number of credit hours you have taken exlcuding this current semester");
      cumuHours = scanner.nextInt();
    }
    System.out.println( "How many classes are you currently taking? ");
    currClasses =  scanner.nextInt();

    for (int i = 1; i <= currClasses; i++ ) {
      System.out.println( "How many credit hours is class " + i + " worth?");
      hoursSum = scanner.nextDouble();
      System.out.println( "What is your letter grade for class " + i + "?");
      letterGrade = scanner.next();

      if ( letterGrade.equalsIgnoreCase("A"))
        currGrade = 4.00;
      else if ( letterGrade.equalsIgnoreCase("B"))
        currGrade = 3.00;
      else if ( letterGrade.equalsIgnoreCase("C"))
        currGrade = 2.00;
      else if ( letterGrade.equalsIgnoreCase("D"))
        currGrade = 1.00;
      else if ( letterGrade.equalsIgnoreCase("F"))
        currGrade = 0.00;
      else System.out.println( "Letter grade not valid");

      totalGradePoints += (currGrade * hoursSum);
      totalHours += hoursSum;
    }

    //calculation
    totalGradePoints = ((cumuGPA * cumuHours) + (totalGradePoints));
    totalHours = (cumuHours + totalHours);

    Double finalGPA = (totalGradePoints) / (totalHours);

    //final output
    System.out.println( "Your GPA for " + totalHours + " credit hours is: " + finalGPA);
  }
}
