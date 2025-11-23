
/*
    iRow : 4
    iCol : 4

    %   #   #   #
    *   %   #   #
    *   *   %   #
    *   *   *   %
    
    Diagonal Pattern
*/

import java.util.*;

// Logic class
class Pattern
{
    // Filter for square matrix
    public void Display(int iRow, int iCol)                                         // Function defination
    {
        int i = 0, j = 0;                                                           // Local Variable

        if(iRow != iCol)                                                            // Check if(Rows == Cols)
        {
            System.out.println("Invalid Input");
            System.out.println("Row Number and Column Number should be same.");
            return;
        }

        for(i = 1; i <= iRow; i++)                                                  // Business Logic 
        {
            
            for( j = 1; j <= iCol; j++)
            {
                if(j < i)
                {
                    System.out.printf("*\t");
                }
                else if(i == j)
                {
                    System.out.printf("%\t");   // Exception
                }
                else
                {
                    System.out.printf("#\t");
                }
            }
            System.out.println();
        }
    }
}

// Main Class
class program191
{
    public static void main(String []args)                                          // Main Method
    {
        Scanner sobj = new Scanner(System.in);                                      // Scanner Object instantiation

        int iValue1 = 0, iValue2 = 0;                                               // Local Variables

        System.out.println("Enter the Number of Rows : ");                          // Accept Rows
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Columns : ");                       // Accept Columns
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();                                               // Object Instantiation
        pobj.Display(iValue1, iValue2);                                             // Function call
    }
}