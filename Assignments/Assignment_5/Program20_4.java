// Write a program to find the largest digit in a given number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findLargestDigit
// Description:   used to find the largest digit in a given number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iTemp = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;

            if(iDigit > iTemp)
            {
                iTemp = iDigit;
            }
        }

        System.out.println(iTemp);

    }
}

class Program20_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);    
    }
}