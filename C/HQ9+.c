#include <stdio.h>
#include <string.h>

int main(void) {
    char temp[100];
    scanf("%s", &temp);
    int len = strlen(temp);
    for(int i = 0; i <= len; i++) {
        if(temp[i] == 'H' || temp[i] == 'Q' || temp[i] == '9' ){
            printf("YES\n");
            return 0;
        }
    }
    printf("NO\n");
    return 0;
}