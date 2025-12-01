// Accept String from user and reverse the string.

#include <stdio.h>

void ReverseDisplay(char *Src)              // Function defination
{
    char *temp = Src;                       // Local Variable
    
    // Business Logic
    while(*Src != '\0')                     // traverse to the end
    {
        Src++;
    }

    while(Src >= temp)                      // till we reach at temp
    {
        printf("%c\n",*Src);
        Src--;
    }
}

int main()                                  // Main method
{
    char Arr[50] = {'\0'};                  // character array declaration, Initialization

    printf("Enter the String :\n");         // Accept String
    scanf("%[^'\n']s", Arr);

    ReverseDisplay(Arr);                    // Function call

    return 0;
}