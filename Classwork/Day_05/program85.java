import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Reverse loop

        for(iCnt = iNo / 2; (iCnt >= 1) && (iSum < iNo); iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                iSum += iCnt;

            }
        }

        return (iSum == iNo);                       
        
    }
}// End of Number class

class program85
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Number nobj = new Number();                     // Creating object of class Number

        bRet = nobj.CheckPerfect(iValue);                    // Function call

        if(bRet == true)
        {
            System.out.println(iValue+" is a Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is not a Perfect Number");
        }
        
        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}