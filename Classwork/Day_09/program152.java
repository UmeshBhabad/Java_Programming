
// Input : 5
// Output : *   *   *   *   *

import java.util.*;

// Logic class
class Pattern
{
    public void Display(int iNo)                                // Function defination
    {
        int iCnt = 0;                                           // Local Variable

        for(iCnt = 1; iCnt <= iNo; iCnt++)                      // Business Logic
        {
            System.out.print("*\t");
        }

        System.out.println();
    }
}

// Main Class
class program152
{
    public static void main(String []args)                      // Main method
    {
        Scanner sobj = new Scanner(System.in);                  // Creating Scanner Object

        int iValue = 0;                                         // Local Variable

        System.out.println("Enter the Frequency : ");           // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                           // Object Instantiation
        pobj.Display(iValue);                                   // Function call
    }
}