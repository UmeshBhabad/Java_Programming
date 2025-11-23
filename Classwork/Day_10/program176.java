
/*
    Input : 5

    Output :    A   B   C   D   E
    index :     1   2   3   4   5
    ASCII :     65  66  67  68  69
*/

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                            // Function Defination
    {
        int iCnt = 0;                                       // Local Variable
        // int i = 65;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; ch++, iCnt++)            // Business Logic
        {
            System.out.printf("%c\t", ch);
        }
    }
}

// Main Class
class program176
{
    public static void main(String []args)                  // Main Method
    {
        Scanner sobj = new Scanner(System.in);              // Scanner Object

        int iValue = 0;                                     // Local variable

        System.out.println("Enter the Frequency : ");       // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                       // Object Instantiation
        pobj.Display(iValue);                               // Function Call
    }
}