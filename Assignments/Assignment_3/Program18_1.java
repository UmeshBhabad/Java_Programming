// Write a program to check whether a number is prime or not.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPrime
// Description:   Used to check whether a number is prime or not.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFrequency++;
                break;
            }
        }

        if(iFrequency > 0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}

class Program18_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPrime(11);    
    }
}