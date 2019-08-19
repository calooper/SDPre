import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int pin, entry;
      String password;

      pin = 12345;
      password = "notapassword";

      System.out.println( "WELCOME TO THE BANK OF JAVA. " );
      System.out.print( "ENTER YOUR PASSWORD. " );
      password = keyboard.nextLine();

      while ( ! password.equals("notapassword") ) {
        System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN. " );
        System.out.print( "ENTER YOUR PASSWORD: " );
        password = keyboard.nextLine();
      }

      System.out.print( "PASSWORD ACCEPTED. ENTER YOUR PIN. " );
      entry = keyboard.nextInt();

      while ( entry != pin ) {
        System.out.println( "\nINCORRECT PIN. TRY AGAIN. " );
        System.out.print( "ENTER YOUR PIN: " );
        entry = keyboard.nextInt();
      }

      System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17 ");
    }
  }
