
/*
    Input : 8

    Output :    1   A   3   B   5   C   7   D
    Index :     1   2   3   4   5   6   7   8
    
*/

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                            // Function defination
    {
        int iCnt = 0;                                       // Local Variable
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++)                  // Business Logic
        {
            if(iCnt % 2 == 1)
            {
                System.out.printf("%d\t", iCnt);
            }
            else
            {
                System.out.printf("%c\t", ch);
                ch++;
            }
        }
    }
}

// Main Class
class program177
{
    public static void main(String []args)                  // Main Method
    {
        Scanner sobj = new Scanner(System.in);              // Scanner Object Instantiation

        int iValue = 0;                                     // Local Variables

        System.out.println("Enter the Frequency : ");       // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                       // Object Instantiation
        pobj.Display(iValue);                               // Function call
    }
}