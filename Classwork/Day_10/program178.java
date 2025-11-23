
/*
    Input : 8

    Output :    z   y   x   w   v   u   t   s
    Index :     1   2   3   4   5   6   7   8
    
*/

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                                // Function Defination
    {
        int iCnt = 0;                                           // Local Variable
        char ch = 'z';

        for(iCnt = 1; iCnt <= iNo; ch--, iCnt++)                // Business Logic
        {
            System.out.printf("%c\t", ch);
        }
    }
}

// Main Method
class program178
{
    public static void main(String []args)                      // Main Method
    {
        Scanner sobj = new Scanner(System.in);                  // Scanner Object Instantiation

        int iValue = 0;                                         // Local Variable

        System.out.println("Enter the Frequency : ");           // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                           // Object Instantiation
        pobj.Display(iValue);                                   // Function call
    }
}