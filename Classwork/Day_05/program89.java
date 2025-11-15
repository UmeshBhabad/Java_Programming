// Accept input from user and find factorial of the given number.

import java.util.*;

class Number
{
    public long  CalculateFactorial(int iNo)
    {
        int iCnt = 0;

        long lFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iCnt = 1;

        while(iCnt <= iNo)                                  // Change
        {
            lFact *= iCnt;
            iCnt++;
        }                    
        
        return lFact;
    }
}// End of Number class

class program89
{
    public static void main(String args[])
    {
        int iValue = 0;
        long lRet = 0;                                              // Important

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Number nobj = new Number();                                 // Creating object of class Number

        lRet = nobj.CalculateFactorial(iValue);                     // Function call

        System.out.println("The factorial of "+iValue+" is "+lRet);
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}