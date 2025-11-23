
/*
    iRow : 4
    iCol : 4

    a   b   c   d
    a   b   c   d
    a   b   c   d
    a   b   c   d
*/

import java.util.*;

// Logic class
class Pattern
{
    public void Display(int iRow, int iCol)                                 // Function defination
    {
        int i = 0, j = 0;                                                   // Local Variables 
        char ch = 'a';

        for(i = 1; i <= iRow; i++)                                          // Business Logic
        {
            for(ch = 'a', j = 1; j <= iCol; ch++, j++)
            {
                System.out.printf("%c\t", ch);
            }
            System.out.println();
        }
    }
}

// Main Class
class program181
{
    public static void main(String []args)                                  // Main method
    {
        Scanner sobj = new Scanner(System.in);                              // Scanner Object Instantiation

        int iValue1 = 0, iValue2 = 0;                                       // Local Variables

        System.out.println("Enter the Number of Rows : ");                  // Accept Rows
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Columns : ");               // Accept Columns
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();                                       // Object Instantiation
        pobj.Display(iValue1, iValue2);                                     // Function call
    }
}