#include <stdio.h>

int add(int a, int b) {
    return a + b;
}

int main() {
    int x = 10, y = 20;
    int result = add(x, y);
    printf("Sum of %d and %d is %d\n", x, y, result);
    return 0;
}