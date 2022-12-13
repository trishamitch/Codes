/***
Write a program that determines the price of a movie ticket (similar to the one in the chapter). 
The program asks for the customer's age and for the time on a 24-hour clock (where noon is 1200 and 4:30 pm is 1630). 
The normal adult ticket price is $8.00, however the adult matinee price is $5.00. Adults are those over 13 years. 
The normal children's ticket price is $4.00, however the children's matinee price is $2.00. Assume that a 
matinee starts at any time earlier than 5 pm (1700).

Get the information from the user and then use nested if statements to determine the ticket price. It is usually a good idea to separate the "information gathering phase" (asking the user for age and time) from the "processing phase" of a program (deciding on the ticket price). There are many ways in which the if statements
**/
package preliminaries.java.bantecil;
import java.util.*;
public class MatineeMovieTickets
{
   public static void main ( String[] args )
   {
   Scanner scan = new Scanner( System.in );
   int age, time;
   double price;
   System.out.print("Customer's age: ");
   age = scan.nextInt();
   System.out.print("Time(military time): ");
   time = scan.nextInt();
   
   if(age>13)
   {
      if(time<1700)
      {
      price= 5.00;
      }
      else
      {
      price= 8.00;
      }
   }
   else{
      if(time<1700)
      {
      price= 2.00;
      }
      else
      {
      price= 4.00;
      }
     }
   System.out.println("The Price of the Movie Ticket is : $" + price);

   

   }
}   