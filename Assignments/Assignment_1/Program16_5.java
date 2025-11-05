// Write a program to count number of digits in a given number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countDigits
// Description:   Used to count number of digits in a given number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countDigits(int iNo)
    {
        int iDigit = 0, iCount = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;

            iCount++;
        }

        System.out.println(iCount);
    }
}

class Program16_5
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
    
}