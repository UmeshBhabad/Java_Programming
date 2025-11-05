// Write a program to check whether a number is a perfect number or not.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPerfect
// Description:   used to check whether a number is a perfect number or not.
// Input:         Integer
// Output:        String
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int iNo)
    {
        int iCnt = 0;
        int iRet = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iRet += iCnt;
            }
        }

        if(iNo == iRet)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Imperfect Number");
        }

    }
}

class Program20_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);    
    }
}