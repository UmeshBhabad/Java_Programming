
/*
    iRow : 6
    iCol : 6

    *   *   *   *   *   *
    *   $   $   $   $   *
    *   $   $   $   $   *
    *   $   $   $   $   *
    *   $   $   $   $   *
    *   *   *   *   *   *
*/

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iRow, int iCol)                                 // Function defination
    {
        int i = 0, j = 0;                                                   // Local Variables

        for(i = 1; i <= iRow; i++)                                          // Business Logic
        {            
            for( j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println();
        }
    }
}

// Main Class
class program184
{
    public static void main(String []args)                                  // Main Method
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