#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    char array[200] = " ";
    scanf("%s", &array);
    int n = strlen(array);
    int flag = 1;
    for(int i = 0; i < n; i++)
    {
        if(array[i] == 'W' && array[i + 1] == 'U' && array[i + 2] == 'B') {
            i += 2;
            if(flag == 0){
                putchar(' ');
                flag = 1;
            }
        }else {
            flag = 0;
            printf("%c", array[i]);
        }
    }
    return 0;
}