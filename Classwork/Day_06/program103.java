// OOP Design

class Arrayx
{
    public int Arr[];
    public int iSize;

    public Arrayx(int iNo)
    {
        iSize = iNo;
        Arr = new int[iSize];
    }
}

class program103
{
    public static void main(String[] args)
    {
        Arrayx aobj1 = new Arrayx(5);
        Arrayx aobj2 = new Arrayx(7);
        Arrayx aobj3 = new Arrayx(3);
    }
}