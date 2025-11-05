// Write a program to check whether a number is positive, negative, or zero.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkSign
// Description:   used to check whether a number is positive, negative, or zero.
// Input:         Integer
// Output:        String
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkSign(int iNo)
    {
        if(iNo == 0)
        {
            System.out.println("Zero");
        }
        else if(iNo > 0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }

    }
}

class Program18_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkSign(-8);    
    }
}