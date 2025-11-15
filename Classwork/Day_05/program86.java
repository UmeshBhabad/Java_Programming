// Accept input from user and find factorial of the given number.

import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int iCnt = 0;

        int iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact *= iCnt;
        }                     
        
        return iFact;
    }
}// End of Number class

class program86
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Number nobj = new Number();                                 // Creating object of class Number

        iRet = nobj.CalculateFactorial(iValue);                     // Function call

        System.out.println("The factorial of "+iValue+" is "+iRet);
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}