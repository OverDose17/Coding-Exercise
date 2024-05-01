#include <stdio.h>

int main() {
    int n, num, l, r, temp, total = 1;
    scanf("%d", &n);
    scanf("%d", &num);
    l = num / 10;
    r = num % 10;
    temp = r;
    n--;
    for(int i = 0; i < n; i++) {
        scanf("%d", &num);
        l = num / 10;
        r = num % 10;
        if(temp == l) {
            total++;
        }
        temp = r;
    }
    printf("%d", total);
    return 0;
}