// Accept input from user and find factorial of the given number.

import java.util.*;

class Number
{
    public long  CalculateFactorial(int iNo)                            // Function Defination
    {
        int iCnt = 0;                                                   // Local Variable
        long lFact = 1;

        if(iNo < 0)                                                     // Updator
        {
            iNo = -iNo;
        }

        iCnt = 1;

        while(iCnt <= iNo)                                              // using while loop
        {
            lFact *= iCnt;
            iCnt++;
        }                    
        
        return lFact;
    }
}// End of Number class

class program89
{
    public static void main(String args[])                              // Main Method
    {
        int iValue = 0;
        long lRet = 0;                                                  // Important

        Scanner sobj=new Scanner(System.in);                            // Scanner Object

        System.out.println("Enter the Number");                         // Input
        iValue = sobj.nextInt();

        Number nobj = new Number();                                     // Creating object of class Number

        lRet = nobj.CalculateFactorial(iValue);                         // Function call

        System.out.println("The factorial of "+iValue+" is "+lRet);     // Output
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();                                                    // Garbage Collector
    }
}