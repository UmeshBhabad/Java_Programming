// Accept number from user and display below pattern.

/*
    Input :     5

    Output :    A   B   C   D   E
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
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; ch++, iCnt++)                    // Business Logic
        {
            System.out.printf("%c\t", ch);
        }
        System.out.println();
    }
}

class Program26_1
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