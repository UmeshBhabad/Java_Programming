import java.util.*;

// Logic class
class StringX
{
    public void Display(String str)                             // Function defination
    {
        int iCnt = 0;                                           // loop counter

        for(iCnt = 0; iCnt < str.length(); iCnt++)              // Business Logic
        {
            System.out.println(str.charAt(iCnt));
        }
    }
}

// Main class
class program244
{
    public static void main(String args[])                      // Main Method
    {
        Scanner scanobj = new Scanner(System.in);               // Scanner Object Instantiation

        System.out.println("Enter String : ");                  // Accept String
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();                         // Logic class Object Instantiation
        strobj.Display(sobj);                                   // Function call
    }
}