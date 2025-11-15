
// Calling Garbage Collector after the execution of objects 

import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)                 // Function Defination
    {
        int iCnt = 0;                                   // Loop Counter
        
        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)          // Logic
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}// End of Number class

class program78
{
    public static void main(String args[])              // Main Method
    {
        int iValue = 0;                                 // Local Variable

        Scanner sobj = new Scanner(System.in);          // Creating Scanner object

        System.out.println("Enter the Number");         // Accepting Input from user
        iValue = sobj.nextInt();

        Number nobj = new Number();                     // Creating object of class Number

        nobj.DisplayFactors(iValue);                    // Function call

        // Important
        sobj = null;                                    // Initiate objects to null after the Use
        nobj = null;

        System.gc();                                    // Calling Garbage Collector
    }
}