// Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDivisibleBy2and3
// Description:   used to print all numbers from 1 to N that are divisible by both 2 and 3.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println(iCnt);
            }
            
        }
    }
}

class Program21_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.printDivisibleBy2and3(30);    
    }
}