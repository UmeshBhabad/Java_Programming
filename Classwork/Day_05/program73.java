// Dynamic program to find factors of a number(using Scanner class).

// Algorithm
/*
START
    1. Accept the number from user whose factors are to be found.
    2. Create a loop to iterate from 1 till the number.
    3. For each number in the range that divides the given number completely:
        a. print them
STOP
*/


import java.util.*;

class program73
{
    public static void main(String args[])                  // Main Method
    {
        int iNo = 0;                                        // Local Variables
        int iCnt = 0;

        Scanner sobj=new Scanner(System.in);                // Creating Scanner Object

        System.out.println("Enter the Number");             // User Input
        iNo = sobj.nextInt();

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)              // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}