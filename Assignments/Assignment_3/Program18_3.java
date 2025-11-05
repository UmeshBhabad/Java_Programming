// Write a program to print all Odd Number up to N.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printOddNumber
// Description:   Used to print all Odd Number up to N.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printOddNumber(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }

    }
}

class Program18_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printOddNumber(11);    
    }
}