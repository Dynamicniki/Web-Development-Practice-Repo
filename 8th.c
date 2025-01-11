#include <stdio.h>
#include <string.h>

int main() {
    char str[100], reverseStr[100];
    int length, i, j, flag = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    length = strlen(str) - 1;  // To ignore newline character from fgets

    // Reverse the string
    for (i = length - 1, j = 0; i >= 0; i--, j++) {
        reverseStr[j] = str[i];
    }
    reverseStr[j] = '\0';

    // Check if palindrome
    for (i = 0; i < length; i++) {
        if (str[i] != reverseStr[i]) {
            flag = 1;
            break;
        }
    }

    if (flag == 0)
        printf("The string is a palindrome.\n");
    else
        printf("The string is not a palindrome.\n");

    return 0;
}