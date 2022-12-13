/***
   Write a program that repeatedly asks the user for a proposed password until the user enters an acceptable password. When the user enters an acceptable password, the program writes a message and exits.

Acceptable passwords:

Are at least 7 characters long.
Contain both upper and lower case alphabetic characters.
Contain at least 1 digit.
The logic of this program can be quite tricky. Hint: use toUpperCase(), toLowerCase, and equals(). You will also need nested ifs.

Here is a run of the program:


C:\>java PasswordChecker
Enter your password:
snowflake
That password is not acceptable.

Enter your password:
SnowFlake
That password is not acceptable.

Enter your password:
snowflake47
That password is not acceptable.

Enter your password:
Snowflake47
Acceptable password.
**/
package preliminaries.java.bantecil;
import java.util.*;
public class PasswordChecker
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      System.out.print("Enter your password: ");
      String text= scan.nextLine();
      boolean flag = false;
   
   
      if(text.length() >= 7)
      {
         if(containsUpperCase(text) && containsLowerCase(text))
         {
            if(containsDigit(text))
            {
               flag = true;
            }
         }
      }
      
      if(flag == true)
      {
         System.out.println("Acceptable password.");
      } else
      {
         System.out.println("That password is not acceptable.");
      }
   }
   
   public static boolean containsUpperCase(String text)
   {
      boolean flag = false;
      for(int i = 0; i < text.length(); i++)
      {
         if(Character.isUpperCase(text.charAt(i)))
         {
            flag = true;
         }   
      }
      return flag;
   }
   
   public static boolean containsLowerCase(String text)
   {
      boolean flag = false;
      for(int i = 0; i < text.length(); i++)
      {
         if(Character.isLowerCase(text.charAt(i)))
         {
            flag = true;
         }   
      }
      return flag;
   }
   
   public static boolean containsDigit(String text)
   {
      boolean flag = false;
      for(int i = 0; i < text.length(); i++)
      {
         if(Character.isDigit(text.charAt(i)))
         {
            flag = true;
         }   
      }
      return flag;
   }
}