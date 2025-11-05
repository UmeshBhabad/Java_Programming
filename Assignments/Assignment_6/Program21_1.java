// Write a program to calculate the product of digits of a number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: productOfDigits
// Description:   used to calculate the product of digits of a number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int iNo)
    {
        int iDigit = 0;
        int iRet = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;

            iRet *= iDigit;
        }

        System.out.println(iRet);

    }
}

class Program21_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);    
    }
}