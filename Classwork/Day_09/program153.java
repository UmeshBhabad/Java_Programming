
// Input : 5
// Output : 1   2   3   4   5

// Logic Class
import java.util.*;

class Pattern
{
    public void Display(int iNo)                            // Function Defination
    {
        int iCnt = 0;                                       // Local Variables

        for(iCnt = 1; iCnt <= iNo; iCnt++)                  // Business Logic
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

// Main Class
class program153
{
    public static void main(String []args)                  // Main Method
    {
        Scanner sobj = new Scanner(System.in);              // Scanner Object

        int iValue = 0;                                     // Local Varaibles

        System.out.println("Enter the Frequency : ");       // Accept Input Frequency
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();                       // Object Instantiation
        pobj.Display(iValue);                               // Function call
    }
}