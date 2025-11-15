import java.util.*;

class Number                                            // Good Programming Practice
{
    public void DisplayFactors(int iNo)                 // Function defination
    {
        int iCnt = 0;                                   // Loop Counter
        
        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)          // Business Logic
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}// End of Number class

class program77
{
    public static void main(String args[])              // Main Method
    {
        int iValue = 0;                                 // Local Variable

        Scanner sobj=new Scanner(System.in);            // Creating Scanner object

        System.out.println("Enter the Number");         // Accepting input from user
        iValue = sobj.nextInt();

        Number nobj = new Number();                     // Creating object of class Number

        nobj.DisplayFactors(iValue);                    // Function call       
    }
}