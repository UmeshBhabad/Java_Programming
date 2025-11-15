// Accept input from user and find factorial of the given number.(using long datatype to handle large numbers)

import java.util.*;

class Number
{
    public long  CalculateFactorial(int iNo)                                // Function defination
    {
        int iCnt = 0;                                                       // Local Variables
        long lFact = 1;

        if(iNo < 0)                                                         // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)                                  // Business Logic
        {
            lFact *= iCnt;
        }                     
        
        return lFact;
    }
}// End of Number class

class program88
{
    public static void main(String args[])                                  // Main Method
    {
        int iValue = 0;                                                     // Local Variable
        long lRet = 0;                                                      // Important

        Scanner sobj=new Scanner(System.in);                                // SCanner object

        System.out.println("Enter the Number");                             // Input
        iValue = sobj.nextInt();

        Number nobj = new Number();                                         // Creating object of class Number

        lRet = nobj.CalculateFactorial(iValue);                             // Function call

        System.out.println("The factorial of "+iValue+" is "+lRet);         // Output
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();                                                        // Garbage Collector
    }
}