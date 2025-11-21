// Input : 6
// Output : -6  -5  -4  -3  -2  -1
//          1   2   3   4   5   6

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                                            // Function call
    {
        int iCnt = 0;                                                       // Local Call

        for(iCnt = -iNo; iCnt <= -1; iCnt++)                                // Business Logic
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

// Main Class
class program157
{
    public static void main(String []args)                                  // Main Method
    {
        Scanner sobj = new Scanner(System.in);                              // Scanner Object Instantiation

        int iValue = 0;                                                     // Local Variable

        System.out.println("Enter the Frequency : ");                       // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                                       // Object Instantiation
        pobj.Display(iValue);                                               // Function call
    }
}