// Accept input from user and display summation of its digits..

import java.util.*;

class Digits
{
    public int  DisplayDigitsRev(int iNo)                           // Function Defination
    {
        int iDigit = 0;                                             // Local Variables
        int iSumDigits = 0;

        while(iNo != 0)                                             // Business Logic
        {
            iDigit = iNo % 10;
            iNo /= 10;
            iSumDigits += iDigit;
        }

        return iSumDigits;   
    }
}// End of Number class

class program91
{
    public static void main(String args[])                          // Main Method
    {
        int iValue = 0;                                             // Local Variable
        int iRet = 0;

        Scanner sobj=new Scanner(System.in);                        // Scanner Object

        System.out.println("Enter the Number");                     // Input
        iValue = sobj.nextInt();

        Digits dobj = new Digits();                                 // Creating object of class Number

        iRet = dobj.DisplayDigitsRev(iValue);                       // Function call

        System.out.println("The sum of digits is "+iRet);           // Display Output

        // Important
        sobj = null;
        dobj = null;

        System.gc();                                                // Garbage Collector
    }
}