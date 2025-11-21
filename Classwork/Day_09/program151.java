// Problems on Patterns Format

// Logic class
class Pattern
{
    public void Display()                           // Function defination
    {
        System.out.println("Inside Display");       // Inside Function
        // Logic of pattern printing
    }
}

// Main class
class program151
{
    public static void main(String []args)          // Main Method
    {
        Pattern pobj = new Pattern();               // Object Instantiation
        pobj.Display();                             // Function Call
    }
}