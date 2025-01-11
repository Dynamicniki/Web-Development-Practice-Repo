#include <stdio.h>

int main() {
    int n, i = 1;
    unsigned long long factorial = 1;

    printf("Enter an integer: ");
    scanf("%d", &n);

    if (n < 0)
        printf("Factorial is not defined for negative numbers.");
    else {
        while (i <= n) {
            factorial *= i;
            i++;
        }
        printf("Factorial of %d = %llu\n", n, factorial);
    }

    return 0;
}