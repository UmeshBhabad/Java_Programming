// Dynamic Array and Applied object-oriented practices by keeping the main class, logic class, and business logic separate for better maintainability

// Logic class

class Arrayx
{
    void Display(int Brr[])                         // Function defination
    {
        int iCnt = 0;                               // Local Variable

        for(iCnt = 0; iCnt < Brr.length; iCnt++)    // Business Logic
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

// Main Class

class program97
{
    public static void main(String args[])          // Main Method
    {
        int Arr[] = new int[4];                     // array declaration, Memory Allocation

        Arr[0] = 10;                                // array Initialization
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;

        Arrayx aobj = new Arrayx();                 // Creating Array object

        aobj.Display(Arr);                          // Function Call
    }
}