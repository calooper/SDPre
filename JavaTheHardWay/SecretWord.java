import java.util.Scanner;

public class SecretWord {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String secret1 = "please", secret2 = "open please", guess;

      System.out.println( "What is the secret word? " );
      guess = keyboard.nextLine();

      if ( guess.equals(secret1) || guess.equals(secret2)) {
        System.out.println( "That is correct! " );
      }
      else {
        System.out.println( "No, the secret word isnt \"" + guess + "\"." );
      }

    }
  }
