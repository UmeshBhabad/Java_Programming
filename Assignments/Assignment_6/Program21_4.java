// Write a program to count total number of factors of a given Number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countFactors
// Description:   used to count total number of factors of a given Number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int iNo)
    {
        int iCnt = 0;
        int iRet = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iRet++;
            }
            
        }

        System.out.println(iRet);

    }
}

class Program21_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.countFactors(20);    
    }
}