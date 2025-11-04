// Write a program to calculate the sum of first N natural Numbers.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: calculateSum
// Description:   Used print sum of all given numbers.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculateSum(int iNo)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum += iCnt;
        }

        System.out.println(iSum);

    }
}

class Program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}