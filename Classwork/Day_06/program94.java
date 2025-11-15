// 

class Arrayx
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program94
{
    public static void main(String args[])
    {
        int Arr[] ={10,20,30,40};

        Arrayx aobj = new Arrayx();

        aobj.Display(Arr);

        
    }
}