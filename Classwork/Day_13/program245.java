import java.util.*;

class program245
{
    public static void main(String args[])                      // Main method
    {
        Scanner scanobj = new Scanner(System.in);               // Scanner Object Instantiation

        System.out.println("Enter String : ");                  // Accept String
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();                        // String to Character array 

        System.out.println(sobj.length());                      // String length
        System.out.println(Arr.length);                         // Array Length
    }
}

// Note :
/*
str.length()    : length() is a method used for String objects.
arr.length      : length is a public field (or property) used for arrays.
*/