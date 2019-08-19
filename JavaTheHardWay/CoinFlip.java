import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String coin, again;
      int streak = 0;
      boolean gotHeads;

      do {
        gotHeads = Math.random() < .5;

        if ( gotHeads )
          coin = "HEADS";
        else
          coin = "TAILS";

        System.out.println( "You flip a coin and it is..." + coin );

        if ( gotHeads ) {
          streak++;
          System.out.println( "\tThat is " + streak + " in a row..." );
          System.out.println( "Would you like to flip again? (Y/N)" );
          again = keyboard.next();
        }
        else {
          System.out.println( "\tYou lose everything!" );
          System.out.println( "\tShould've quit while you were aHEAD!! " );
          streak = 0;
          again = "N";
        }
      } while ( again.equals("Y") );
      System.out.println( "Final score: " + streak );
  }
}
