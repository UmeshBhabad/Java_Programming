// Write a program to reverse a number.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: reverseNumber
// Description:   Used to find reverse a number.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void reverseNumber(int iNo)
    {
        int iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo /= 10;

            System.out.print(iDigit);
        }
    }
}

class Program16_4
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
    
}