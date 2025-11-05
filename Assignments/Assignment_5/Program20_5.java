// Write a program to find the Smallest digit in a given number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findSmallestDigit
// Description:   used to find the Smallest digit in a given number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iTemp = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;

            if(iDigit < iTemp)
            {
                iTemp = iDigit;
            }
        }

        System.out.println(iTemp);

    }
}

class Program20_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);    
    }
}