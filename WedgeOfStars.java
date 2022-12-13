/***
   Write a program that writes a wedge of stars. The user enters the initial number of stars, and the program writes out lines of stars. Each line has one few star than the previous line:

Initial number of stars:
7

*******
******
*****
****
***
**
*
**/
package preliminaries.java.bantecil;
import java.util.*;
public class WedgeOfStars
{
   public static void main ( String[] args )
  {
      Scanner scan = new Scanner( System.in );
      int number = 0;
      
      System.out.println("Initial number of stars: ");
      number = scan.nextInt();
         
      for(int i = number; i > 0; i--) {
         for(int j = 0; j < i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}   