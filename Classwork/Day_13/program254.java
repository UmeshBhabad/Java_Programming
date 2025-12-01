// Accept string from user and replace first character with '_' character.

import java.util.*;

// Logic class
class StringX
{
    public String Update(String str)                                    // Function defination
    {
        char Arr[] = str.toCharArray();                                 // String to character array

        Arr[0] = '_';                                                   // Business Logic

        return new String(Arr); // Change
    }
}

// Main class
class program254
{
    public static void main(String args[])                              // Main Method
    {
        Scanner scanobj = new Scanner(System.in);                       // Scanner Object Instantiation

        System.out.println("Enter String : ");                          // Accept String
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();                                 // Logic class Object Instantiation

        sobj = strobj.Update(sobj); // Change(Not Preferrable)          // Function call(storing new string in existing string vairable)

        System.out.println("Updated String : " + sobj);                 // Display Output
    }
}