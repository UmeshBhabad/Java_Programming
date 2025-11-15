// Accept input from user and display its digits in reverse order.

import java.util.*;

class Digits
{
    public void  DisplayDigitsRev(int iNo)                          // Function Defination
    {
        int iDigit = 0;                                             // Local Variable

        while(iNo != 0)                                             // Business Logic
        {
            iDigit = iNo % 10;
            iNo /= 10;
            System.out.println(iDigit);
        }   
    }
}// End of Digit class

class program90
{
    public static void main(String args[])                          // Main Method
    {
        int iValue = 0;                                             // Local Variable

        Scanner sobj=new Scanner(System.in);                        // Scanner object

        System.out.println("Enter the Number");                     // Input
        iValue = sobj.nextInt();

        Digits dobj = new Digits();                                 // Creating object of class Number

        dobj.DisplayDigitsRev(iValue);                              // Function call

        
        // Important
        sobj = null;
        dobj = null;

        System.gc();                                                // Garbage Collector
    }
}