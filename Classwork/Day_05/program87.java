// Accept input from user and find factorial of the given number.(with Updater)

// Cannot find factorial for large numbers

import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)                              // Function Defination
    {
        int iCnt = 0;                                                   // Local Variables
        int iFact = 1;

        if(iNo < 0)                                                     // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)                              // Business Logic
        {
            iFact *= iCnt;
        }                     
        
        return iFact;
    }
}// End of Number class

class program87
{
    public static void main(String args[])                              // Main Method
    {
        int iValue = 0;                                                 // Local Variables
        int iRet = 0;

        Scanner sobj=new Scanner(System.in);                            // Creating Scanner object

        System.out.println("Enter the Number");                         // Input
        iValue = sobj.nextInt();

        Number nobj = new Number();                                     // Creating object of class Number

        iRet = nobj.CalculateFactorial(iValue);                         // Function call

        System.out.println("The factorial of "+iValue+" is "+iRet);     // Output
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();                                                    // Garbage Collector
    }
}