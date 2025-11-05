// Write a program to display all factors of a given Number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayFactors
// Description:   used to display all factors of a given Number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
            
        }

    }
}

class Program21_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.displayFactors(12);    
    }
}