// Program to check whether the given Number is Perfect or not.(Optimized)

import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)                                                    // Function defination
    {
        int iCnt = 0;                                                                       // Local Variables
        int iSum = 0;
        
        if(iNo < 0)                                                                         // Updater
        {
            iNo = -iNo;
        }
                                            // Change
        for(iCnt = 1; (iCnt <= iNo / 2) && (iSum < iNo); iCnt++)                            // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                iSum += iCnt;

            }
        }

        return (iSum == iNo);                       
        
    }
}// End of Number class

class program84
{
    public static void main(String args[])                                                  // Main Method
    {
        int iValue = 0;                                                                     // Local Variables
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);                                              // Creating Scanner object

        System.out.println("Enter the Number");                                             // Input
        iValue = sobj.nextInt();

        Number nobj = new Number();                                                         // Creating object of class Number

        bRet = nobj.CheckPerfect(iValue);                                                   // Function call

        if(bRet == true)                                                                    // Output
        {
            System.out.println(iValue+" is a Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is not a Perfect Number");
        }
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();                                                                        // Garbage Collector
    }
}