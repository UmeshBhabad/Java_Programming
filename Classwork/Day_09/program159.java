
// Input : 6
// Output : 0   1   2   3   4   5   6

import java.util.*;

// Logic Class
class Pattern
{
    public void Display(int iNo)                                    // Function call
    {
        int iCnt = 0;                                               // Local Variable

        for(iCnt = 0; iCnt <= iNo; iCnt++)                          // Business Logic
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

// Main class
class program159
{
    public static void main(String []args)                          // Main Method
    {
        Scanner sobj = new Scanner(System.in);                      // Scanner Object Instantiation

        int iValue = 0;                                             // Local Variable

        System.out.println("Enter the Frequency : ");               // Accept Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                               // Object Instantiation
        pobj.Display(iValue);                                       // Function call
    }
}