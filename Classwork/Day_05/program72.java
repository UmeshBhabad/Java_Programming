// Program to print factors of number 12

class program72
{
    public static void main(String args[])              // Main method
    {
        int iNo = 12;                                   // Local Variable
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)          // Iteration for repetative analysis
        {
            if(iNo % iCnt == 0)                         // Logic
            {
                System.out.println(iCnt);
            }
        }
    }
}


// Programming steps

/*
Step1: Understand the problem statement
Step2: Write the algorithm
Step3: Decide the programming Language
Step4: Write a program
Step5: Test the program
*/