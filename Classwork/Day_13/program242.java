// Hello

// H
// e
// l
// l
// o

import java.util.*;

// Main Class
class program242
{
    public static void main(String args[])              // main method
    {
        Scanner sobj = new Scanner(System.in);          // Scanner Object Instantiation

        System.out.println("Enter String : ");          // Accept String
        String str = sobj.nextLine();

        System.out.println(str.charAt(0));              // Print characters
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));

    }
}