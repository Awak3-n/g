/*
 * Author: Michael Richards, mrichards2021@fit.edu
 * Course: CSE 1002, Section 02, Spring 2022
 * Project: Morgage
 */
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Morgage {
   public static void main (final String[] args) {

      final Scanner stdin = new Scanner(System.in, "US-ASCII");
      BigDecimal borrowed = new BigDecimal (stdin.next());
      BigDecimal interest = new BigDecimal (stdin.next());
      final String wordBalance = "balance";
      final BigDecimal one = new BigDecimal ("1");
      interest = interest.add(one);

      while (stdin.hasNext()) {
         if (wordBalance.equals(stdin.next().toLowerCase())) {
            if (borrowed.compareTo(BigDecimal.ZERO) > 0 ) {
               System.out.printf("balance: %s left%n", borrowed);
            } else if (borrowed.compareTo(BigDecimal.ZERO) < 0 ) {
               System.out.printf("balance: %s over%n", borrowed );
            }
         } else {
            final BigDecimal payed = new BigDecimal (stdin.next());
            borrowed = borrowed.multiply(interest);
            borrowed = borrowed.subtract(payed);
            borrowed = borrowed.setScale(2, RoundingMode.HALF_UP);

         }


      }
   }
}