import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int secret, guess;

      secret = 1 + (int)(Math.random()*10);

      System.out.println( "I am thinking of a number between 1-10. " );
      System.out.println( "Try to guess it. " );
      System.out.print( "Your guess: " );
      guess = keyboard.nextInt();

      while ( secret != guess ) {
        System.out.println( "That is incorrect. Guess again. " ) ;
        System.out.print( "Your guess. " );
        guess = keyboard.nextInt();

      }

      System.out.println( "That is right! You're a good guesser. " );
    }
  }
