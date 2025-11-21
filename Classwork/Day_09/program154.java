// Input : 6
// Output : 1   *   3   *   5   *

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                                // Function Defination
    {
        int iCnt = 0;                                           // Local Variables

        for(iCnt = 1; iCnt <= iNo; iCnt++)                      // Business Logic
        {
            if((iCnt % 2) == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCnt+"\t");
            }
        }

        System.out.println();
    }
}

// Main Class
class program154
{
    public static void main(String []args)                      // Main Method
    {
        Scanner sobj = new Scanner(System.in);                  // Scanner Object Instantiation

        int iValue = 0;                                         // Local Variable

        System.out.println("Enter the Frequency : ");           // Accept Input Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                           // Object Instantiation
        pobj.Display(iValue);                                   // Function Call
    }
}