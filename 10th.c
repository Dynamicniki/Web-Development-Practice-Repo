 #include <stdio.h>

int main() {
    int num, i, flag = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    for (i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            flag = 1;
            break;
        }
    }

    if (num <= 1)
        flag = 1;

    if (flag == 0)
        printf("%d is a prime number.\n", num);
    else
        printf("%d is not a prime number.\n", num);

    return 0;
}