// Accept input from user and display summation of its digits..

import java.util.*;

class Digits
{
    public int  DisplayDigitsRev(int iNo)
    {
        int iDigit = 0;
        int iSumDigits = 0;

        while(iNo != 0)
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
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();                                 // Creating object of class Number

        iRet = dobj.DisplayDigitsRev(iValue);                     // Function call

        System.out.println("The sum of digits is "+iRet);           // Display Output

        // Important
        sobj = null;
        dobj = null;

        System.gc();
    }
}