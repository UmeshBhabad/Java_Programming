// Hello

// H
// e
// l
// l
// o

import java.util.*;

// Main class
class program243
{
    public static void main(String args[])              // Main Method
    {
        Scanner sobj = new Scanner(System.in);          // Scanner Object Instantiation

        System.out.println("Enter String : ");          // Accept String
        String str = sobj.nextLine();

        int iCnt = 0;                                   // Local Variable

        for(iCnt = 0; iCnt < str.length(); iCnt++)      // Print characters
        {
            System.out.println(str.charAt(iCnt));
        }
    }
}