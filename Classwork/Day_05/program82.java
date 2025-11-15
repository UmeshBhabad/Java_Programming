// Program to check whether the given Number is Perfect or not.(reduced approach)

import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)                                    // Function Defination
    {
        int iCnt = 0;                                                       // Local Variable
        int iSum = 0;
        
        if(iNo < 0)                                                         // Updater
        {
            iNo = -iNo;
        }
        
        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)                              // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                iSum += iCnt;
            }
        }

        return (iSum == iNo);                                               // Change
        
    }
}// End of Number class

class program82
{
    public static void main(String args[])                                  // Main Method
    {
        int iValue = 0;                                                     // Local Variable
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);                              // Creating Scanner object

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Number nobj = new Number();                                         // Creating object of class Number

        bRet = nobj.CheckPerfect(iValue);                                   // Function call

        if(bRet == true)                                                    // Displaying Output
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

        System.gc();                                                        // Calling Garbage Collector
    }
}