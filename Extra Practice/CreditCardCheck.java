import java.util.Scanner;
import java.lang.Math.*;

public class CreditCardCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println( "Please enter a 16 - digit credit card number for validation purposes \nusing the luhn algorithm: ");
    String cardStr = scanner.nextLine();

    if (cardStr.length() != 16) {
      System.out.println( "That is not a valid card length. Please use 16 digits");
    }
    else {
      cardStr = cardStr;
    }
    long cardNum, cardSingle, cardDouble, cardEven, total, totalSingle, totalDouble;
    cardSingle = 0;
    cardDouble = 0;
    cardEven = 0;
    total = 0;
    totalSingle = 0;
    totalDouble = 0;

    cardNum = Long.parseLong(cardStr);

    for (int i = 0; i < cardStr.length(); i ++ ) {
      if ( i % 2 == 1 ) {
        String cardSubStr = (cardStr.substring(i-1, i));
        cardNum = Long.parseLong(cardSubStr);
        cardNum = cardNum * 2;

        if (cardNum > 9){
          cardDouble = ((cardNum % 10) + (cardNum / 10));
          totalDouble += cardDouble;
        }
        if (cardNum <= 9 ) {
          cardSingle = cardNum;
          totalSingle += cardSingle;
        }
        total = totalDouble + totalSingle;
      }
      if ( i % 2 == 0 ) {
        String cardSubStr = (cardStr.substring(i+1, i+2));
        cardNum = Long.parseLong(cardSubStr);
        cardEven += cardNum;
        }
      total += cardEven;
    }
    String cardType = (cardStr.substring(0, 1));
    if (cardType.equals("3")) {
      cardType = "Travel Card/ or American Express Card";
    }
    if (cardType.equals("4")) {
      cardType = "Visa Card";
    }
    if (cardType.equals("5")) {
        cardType = "MasterCard";
    }
    if (cardType.equals("6")) {
        cardType = "Discover Card";
    }
    if (total % 10 == 0 ) {
      System.out.println( "\nThis is a valid " + cardType);
      }
    else System.out.println( "\nThis is not a valid card");
  }
}
