// Write a program to calculate the power of a number using loops.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: calculatePower
// Description:   used to calculate the power of a number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int iBase, int iExp)
    {
        int iCnt = 0;
        int iRet = 1;

        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iRet *= iBase;
        }

        System.out.println(iRet);
    }
}

class Program19_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);    
    }
}