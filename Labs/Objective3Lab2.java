import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String [] args ) {

    Scanner input = new Scanner(System.in);

    System.out.println( "What is your name? ");
    String name = input.nextLine();

    System.out.println( "Hello " + name );

    input.close();

  }
}
