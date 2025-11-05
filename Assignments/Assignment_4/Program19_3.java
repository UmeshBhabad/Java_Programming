// Write a program to check whether a number is divisible by 5 and 11 or not.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkDivisible
// Description:   used to check whether a number is divisible by 5 and 11 or not.
// Input:         Integer
// Output:        String
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int iNo)
    {
        if(iNo % 5 == 0 && iNo % 11 == 0)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not Divisible");
        }
        

    }
}

class Program19_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);    
    }
}