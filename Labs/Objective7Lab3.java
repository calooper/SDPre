import java.util.Scanner;

public class Objective7Lab3 {
    public static void main( String[] args) {
      Scanner scanner = new Scanner(System.in);
      int selection;

      while ( true ) {
        printMenu();
        selection = scanner.nextInt();
        if ( selection == 1) {
          System.out.println( "\n\nHello Human\n\n" );
        }
        if ( selection == 2) {
          System.out.println( "\n\nApples, Bananas, Coconuts\n\n" );
        }
        if ( selection == 3) {
          System.out.println( "\n\nGoodbye\n\n" );
          break;
        }
        if (selection > 3 || selection < 1) {
          System.out.println( "\n\nerror\n\n");
        }
      }
    }
    public static void printMenu() {
      System.out.println( "____Menu____");
      System.out.println( "1. Say Hello");
      System.out.println( "2. List my favorite foods");
      System.out.println( "3. Exit");
      System.out.println();

    }
  }
