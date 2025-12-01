import java.util.*;

class program241
{
    public static void main(String args[])                                  // Main method
    {
        Scanner sobj = new Scanner(System.in);                              // Scanner Object Instantiaion

        System.out.println("Enter String : ");                              // Accept String
        String str = sobj.nextLine();

        System.out.println("Input is : "+str);                              // Display String

        System.out.println("Length of the String is : "+str.length());      // Display string Length
    }
}