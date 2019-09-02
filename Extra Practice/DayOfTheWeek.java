import java.util.Scanner;
import java.lang.Math.*;

public class DayOfTheWeek {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //declared variables
    int [] month = {0,31,59,90,120,151,181,212,243,273,304,334};
    String [] weekDay = { "Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

    System.out.println( "Please type in the day you were born ( DD /mm/yyyy)" );
    int day = scanner.nextInt();

    System.out.println( "Please type in the month you born (dd/ MM /yyyy)" );
    int inputMonth = scanner.nextInt();
    inputMonth = month[inputMonth-1];

    System.out.println( "Please type in your birth year (dd/mm/ YYYY ) ");
    int year = scanner.nextInt();

    //calculation
    int leapDays = 0;
    for ( int i = 0; i <= year; i++ )
      if (( i % 4 == 0 && i % 100 != 0) || ( i % 400 == 0)) {
        leapDays += 1;
      }

    if ( inputMonth < 3 && ( year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
        leapDays -= 1;
      }

    int totalDays = ((year-1) * 365) + (inputMonth) + (day) + (leapDays);
    int remainder = totalDays % 7;

    System.out.println("Total days from year one to your selected date:" + totalDays);
    System.out.println("Day of the week: " + weekDay[remainder]);
  }
}
