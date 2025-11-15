// Accept input from user and display its digits in reverse order.

import java.util.*;

class Digits
{
    public void  DisplayDigitsRev(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;
            System.out.println(iDigit);
        }   
    }
}// End of Number class

class program90
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();                                 // Creating object of class Number

        dobj.DisplayDigitsRev(iValue);                     // Function call

        
        // Important
        sobj = null;
        dobj = null;

        System.gc();
    }
}