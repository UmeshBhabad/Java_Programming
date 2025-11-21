
// Input : 5
// Output : -5  -4  -3  -2  -1  0   1   2   3   4   5

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                                // Main Method
    {
        int iCnt = 0;                                           // Local Variable

        for(iCnt = -iNo; iCnt <= iNo; iCnt++)                   // Business Logic
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

// Main Method
class program161
{
    public static void main(String []args)                      // Main Method
    {
        Scanner sobj = new Scanner(System.in);                  // Scanner Object Instantiation

        int iValue = 0;                                         // Local Variable

        System.out.println("Enter the Frequency : ");           // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                           // Object Instantiation
        pobj.Display(iValue);                                   // Function Call
    }
}