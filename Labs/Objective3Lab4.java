import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String [] args ) {
    Scanner input = new Scanner(System.in);

    int age;
    String firstName, lastName;

    System.out.println( "What is your first name? ");
    firstName = input.nextLine();

    System.out.println( "What is your last name? ");
    lastName = input.nextLine();

    System.out.println( "How old are you? ");
    age = input.nextInt();

    System.out.println( "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);
    input.close();
 }
}
