
// Input : 6
// Output : 1   *   2   *   3   *
//          1   2   3   4   5   6

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                                // Function Call 
    {
        int iCnt = 0;                                           // Local Variable

        for(iCnt = 1; iCnt <= iNo; iCnt++)                      // Business Logic
        {
            if(iCnt % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print((iCnt / 2) + 1 +"\t");
            } 
        }

        System.out.println();
    }
}

// Main Class
class program163
{
    public static void main(String []args)                      // Main Method
    {
        Scanner sobj = new Scanner(System.in);                  // Scanner Object Instantiation

        int iValue = 0;                                         // local Variable

        System.out.println("Enter the Frequency : ");           // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                           // Object Instantiation
        pobj.Display(iValue);                                   // Function call
    }
}