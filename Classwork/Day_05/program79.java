// // Program to check whether the given Number is Perfect or not.(without Updater)

import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)                           // Function Defination
    {
        int iCnt = 0;                                               // Local Variables
        int iSum = 0;
        
        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)                      // Iteration
        {
            if(iNo % iCnt == 0)                                     // Condition
            {
                iSum += iCnt;                                       // Business Logic
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}// End of Number class

class program79
{
    public static void main(String args[])
    {
        int iValue = 0;                                             // Local Variables
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);                      // Creating Scanner Object

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Number nobj = new Number();                                 // Creating object of class Number

        bRet = nobj.CheckPerfect(iValue);                           // Function call

        if(bRet == true)                                            // Display Output
        {
            System.out.println(iValue+" is Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is not a Perfect Number");
        }

        // Important

        sobj = null;
        nobj = null;

        System.gc();                                                // Calling Garbage Collector
    }
}
