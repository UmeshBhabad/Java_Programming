// Write a program to find the sum of even and odd digits in a Number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumEvenOddNumber
// Description:   Used to find the sum of even and odd digits in a Number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenOddDigits(int iNo)
    {
        int iSumEven = 0, iSumOdd = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;

            if(iDigit % 2 == 0)
            {
                iSumEven += iDigit;
            }
            else
            {
                iSumOdd += iDigit;
            }
        }

        System.out.println("Sum of even digits is "+ iSumEven);

        System.out.println("Sum of Odd digits is "+ iSumOdd);

    }
}

class Program18_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);    
    }
}