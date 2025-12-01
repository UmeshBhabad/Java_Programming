// Accept String from user and reverse the string.

#include <stdio.h>

void strrevX(char *Src)                     // Function defiantion
{
    char *Start = Src;                      // Local pointer variables
    char *End = Src;
    char temp = '\0';
    
    // Business Logic
    while(*End != '\0')                     // traverse to the end
    {
        End++;
    }

    End--;

    while(End > Start)                      // till End > Start
    {
        // Swap
        temp = *Start;
        *Start = *End;
        *End = temp;

        // Update Pointer
        Start++;
        End--;
    }
}

int main()                                  // Main Method
{
    char Arr[50] = {'\0'};                  // Character Array declaration, Initialization

    printf("Enter the String :\n");         // Accept String
    scanf("%[^'\n']s", Arr);

    strrevX(Arr);                           // Function call

    printf("Updated String : %s\n", Arr);   // Display Output

    return 0;
}