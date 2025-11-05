// Write a program to print each digits of a number separately.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDigits
// Description:   used to print each digits of a number separately.
// Input:         Integer
// Output:        Integer
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int iNo)
    {
        int iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iNo /= 10;

            System.out.println(iDigit);
        }

    }
}

class Program19_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printDigits(9876);    
    }
}