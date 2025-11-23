// Printing Characters

/*
    Input : 5

    Output :    a   b   c   d   e
    index :     1   2   3   4   5
    ASCII :     97  98  99  100 101
*/

import java.util.*;

// Logic class
class Pattern
{
    public void Display(int iNo)                                    // Function defination
    {
        int iCnt = 0;                                               // Local Variables
        int i = 96;

        for(iCnt = 1; iCnt <= iNo; iCnt++)                          // Business Logic
        {
            System.out.printf("%d\t", i + iCnt);
        }
        System.out.println();
    }
}

// Main Class
class program171
{
    public static void main(String []args)                          // Main Method
    {
        Scanner sobj = new Scanner(System.in);                      // Scanner Object Instantiation

        int iValue = 0;                                             // Local Variable

        System.out.println("Enter the Frequency : ");               // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                               // Object Instantiation
        pobj.Display(iValue);                                       // Function call
    }
}