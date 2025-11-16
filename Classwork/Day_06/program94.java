// Static array and Applied object-oriented practices by keeping the main class, logic class, and business logic separate for better maintainability

// Logic class

class Arrayx
{
    public void Display(int Brr[])                      // Function Defination
    {
        int iCnt = 0;                                   // Loop-Counter

        for(iCnt = 0; iCnt < Brr.length; iCnt++)        // Business Logic
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

// main class

class program94
{
    public static void main(String args[])              // Main Method
    {
        int Arr[] ={10,20,30,40};                       // Array Declaration and Initialization

        Arrayx aobj = new Arrayx();                     // Creating Logic class object

        aobj.Display(Arr);                              // Logic-Fuction call        
    }
}