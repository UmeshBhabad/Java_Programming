
/*
    iRow : 4
    iCol : 4

    *   *   *   *
    2   2   2   2
    *   *   *   *
    4   4   4   4
*/

import java.util.*;

// Logic class
class Pattern
{
    public void Display(int iRow, int iCol)                             // Main method
    {
        int i = 0, j = 0;                                               // Local Variables

        for(i = 1; i <= iRow; i++)                                      // Business Logic
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(i+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}

// Main Class
class program169
{
    public static void main(String []args)                              // Main Method
    {
        Scanner sobj = new Scanner(System.in);                          // Scanner Object

        int iValue1 = 0, iValue2 = 0;                                   // Local Variable

        System.out.println("Enter the Number of Rows : ");              // Accept Rows
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Columns : ");           // Accept Columns
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();                                   // Object Instantiation
        pobj.Display(iValue1, iValue2);                                 // Function call
    }
}