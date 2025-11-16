// Static Array Declaration, Initialization and Display of the Elements

// Main Class

class program93
{
    public static void main(String args[])                              // Main Method
    {
        int Arr[] ={10,20,30,40};                                       // Array declaration and initialization

        System.out.println("Number of Elements : "+ Arr.length);        // print array length

        int iCnt = 0;                                                   // loop counter

        for(iCnt = 0; iCnt < Arr.length; iCnt++)                        // Iteration
        {
            System.out.println(Arr[iCnt]);
        }
            
    }
}