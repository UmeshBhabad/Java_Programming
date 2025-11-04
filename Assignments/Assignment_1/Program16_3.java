// Write a program to find the factorial of a number using a for loop.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findFactorial
// Description:   Used to find the factorial of a number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////


class Logic
{
    void findFactorial(int iNo)
    {
        int iCnt = 0;
        int iRet = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iRet *= iCnt;
        }

        System.out.println(iRet);
    }
}

class Program16_3
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
    
}