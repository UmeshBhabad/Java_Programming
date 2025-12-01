// Accept string from user and replace first character with '_' character.

import java.util.*;

// Logic class
class StringX
{
    public String Update(String str)                                    // Function defination
    {
        char Arr[] = str.toCharArray();                                 // String to character array

        Arr[0] = '_';                                                   // Business Logic

        String temp = new String(Arr);                                  // Character array to String

        return temp;
    }
}

// Main class
class program252
{
    public static void main(String args[])                              // Main Method
    {
        String sRet = null;                                             // Local Variable
        
        Scanner scanobj = new Scanner(System.in);                       // Scanner Object Instantiation

        System.out.println("Enter String : ");                          // Accept String
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();                                 // Logic class Object Instantiation

        sRet = strobj.Update(sobj);                                     // Function call

        System.out.println("Updated String : " + sRet);                 // Display Output
    }
}