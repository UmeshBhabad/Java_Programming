// Write a program to display the grade of a student based on marks.

///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayGrade
// Description:   used to display the grade of a student based on marks.
// Input:         Integer
// Output:        String
// Author:        Umesh Shivaji Bhabad
// Date:          04/11/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int iMarks)
    {
        if(iMarks < 40)
        {
            System.out.println("Fail");
        }
        else if(iMarks >= 40 && iMarks <= 60)
        {
            System.out.println("Satisfactory");
        }
        else if(iMarks > 60 && iMarks <= 80)
        {
            System.out.println("Good");
        }
        else if(iMarks >= 00 )
        {
            System.out.println("Excellent");
        }

    }
}

class Program19_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.displayGrade(82);    
    }
}