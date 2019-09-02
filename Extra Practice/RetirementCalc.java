import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;

public class RetirementCalc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print( "Please enter your current age: ");
    int ageCurrent = scanner.nextInt();
    System.out.print( "Please enter your current savings: $");
    double currentSav = scanner.nextDouble();
    System.out.print( "Please enter the age in which you wish to retire: ");
    int ageToRetire = scanner.nextInt();
    System.out.print( "Please enter your current salary: $");
    double salary =  scanner.nextDouble();

    System.out.print( "Please enter the percentage of your salary you wish to contribute to your 401k: ($19,0000 max) ");
    double salarySaving = scanner.nextDouble();
    System.out.print( "Please enter your expected annual increase (2% is a good estimate) ");
    double wageIncrease = scanner.nextDouble();
    System.out.print( "Please enter the max percentage that your employer will match ");
    double employerMatch = scanner.nextDouble();
    System.out.print( "Please enter your expected annual growth of savings (6% is a good estimate) ");
    double investGrowth = scanner.nextDouble();

    //conversion to decimal
    wageIncrease *=  .01;
    employerMatch *= .01;
    investGrowth *= .01;
    salarySaving *= .01;

    //calculation
    double remainYears = ageToRetire - ageCurrent;
    int year = 2019;

    double savingsSum = currentSav;
    double earningSum = 0;
    for (double i = 1; i <= remainYears; i++) {
      earningSum +=  salary;
      savingsSum += ((salarySaving * salary) + (employerMatch * salary));
      savingsSum  = ((1 + investGrowth) * savingsSum);

      //outputs for each year of work
      System.out.println( "---------------------------------------");
      System.out.println( "Stats for age " + ageCurrent + " are:"  );
      System.out.println( "Salary in " + year + ": $" + Math.round(salary));
      System.out.println( "Accumulated earnings: $" + Math.round(earningSum) );
      System.out.println( "Accumulated savings total: $" + Math.round(savingsSum) + " after an annual growth rate of " + Math.round((investGrowth * 100)) + "%" );
      System.out.println( "\tTotal accumulated interst: $" + (Math.round(savingsSum) - Math.round(salarySaving * earningSum) - Math.round(employerMatch * earningSum)));
      System.out.println( "\tHow much you have contributed to date: $" + Math.round((salarySaving * earningSum)));
      System.out.println( "\tEmployer's contributed amount to date: $" + Math.round((employerMatch * earningSum)));
      System.out.println( "----------------------------------------");
      salary = (salary * (1 + wageIncrease));
      ageCurrent++;
      year++;
    }

    //calculating value considering inflation
    double inflatSum = savingsSum;
    double inflatRate = .025;

    while (remainYears > 1 ) {
      double startAmount = inflatSum;
      inflatSum = startAmount - (inflatRate * startAmount);
      remainYears--;
    }

  //final output for final amounts after retirement
  System.out.println( "=================================================================================================");
  System.out.println( "Your final stats upon retirement in " + (year-1));
  System.out.println( "Savings value at retirement (unadjusted for inflation rate): $" + Math.round(savingsSum));
  System.out.println( "Savings value at time of retirement in today's value (2.5% inflation): $" + Math.round(inflatSum));
  System.out.println( "=================================================================================================");

  }
}
