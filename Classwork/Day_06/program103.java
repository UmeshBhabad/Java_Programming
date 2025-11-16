// Applying Object-Oriented Approach for Programming

// Logic Class
class Arrayx
{
    // Logic-Class parameter
    public int Arr[];                           // Array Declaration
    public int iSize;                           // Array Size variable

    public Arrayx(int iNo)                      // Parameterized Constructor
    {
        iSize = iNo;                            // Instantiation, Assignment
        Arr = new int[iSize];                   // Array Instantiation, Memory Allocation
    }
}

// Main Class
class program103
{
    public static void main(String[] args)      // Main Method
    {
        Arrayx aobj1 = new Arrayx(5);           // Object Instantiation
        Arrayx aobj2 = new Arrayx(7);
        Arrayx aobj3 = new Arrayx(3);
    }
}