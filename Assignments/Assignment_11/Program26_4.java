// Accept number from user and display below pattern.

/*
    Input :     4

    Output :    #   1   *   #   2   *   #   3   *   #   4   *
    Index:      1   2   3   4   5   6   7   8   9   10  11  12
*/

///////////////////////////////////////////////////////////////////////////////////
//
// Java Standard Library
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name    :   Display
// Description      :   used to display given pattern.
// Input            :   Integer, Integer
// Output           :   Integer
// Author           :   Umesh Shivaji Bhabad
// Date             :   24/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

// Logic class
class Pattern
{
    public void Display(int iNo)                                    // Function defination
    {
        int iCnt = 0;                                               // Local Variables
        int iNum = 0;

        for(iCnt = 1, iNum = 1; iCnt <= iNo; iNum++, iCnt++)        // Business Logic
        {
            System.out.print("#\t");
            System.out.print(iNum+"\t");
            System.out.print("*\t");
        }
        System.out.println();
    }
}

class Program26_4
{
    public static void main(String[] args)                          // Main Method
    {
        int iValue = 0;                                             // Local Variable

        Scanner sobj = new Scanner(System.in);                      // Scanner Object Instantiation

        System.out.println("Enter the Frequency : ");               // Accept Frequency
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();                               // Logic class Instantiation
        pobj.Display(iValue);

        pobj = null;                                                // Set object to null after use
        sobj = null;

        System.gc();                                                // Call Garbage collector
    }    
}