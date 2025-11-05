// Write a program to find sum of all even numbers upto N.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumEvenNumbers
// Description:   used to find sum of all even numbers upto N.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum += iCnt;
            }
        }

        System.out.println(iSum);
    }
}

class Program20_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);    
    }
}