#include <stdio.h>
#include <stdlib.h>

int analayze(char *string_temp, int length);
void countnprint(int index, int * array_temp, char *string_temp, int length_temp);

//printf("okey");
int main(void) {

    int num;
    int len;
    scanf (" %d", &num);

    // iteration recieve the string and pass to analyze
    for(int i = 0; i < num; i++) { 
        char * temp;
        scanf(" %d", &len);
        temp = malloc(sizeof(char) * len);
        if(len == 1) {
            printf("%d", 0);
            free(temp);
            continue;
        }
        scanf(" %s", temp);
        analayze(temp, len);
        free(temp);
    }
}

int analayze(char *string_temp ,int length) {
    //printf("%s\n", string_temp);
    int * array;
    array = malloc(sizeof(int) * length);

    for(int i = 0; i < length; i++) {
        array[i] = 0;
    }

    float mid = ((float) length - 1) / 2;

    for(float i = 0; i < (float) length; i++) {
        if(i < mid) {
            array[(int) i] = length - ((int)i + 1);
        }
        else if(i > mid || i == mid) {
            array[(int) i] = (int) i ;
        }
        countnprint((int) i, array, string_temp, length);
    }

    free(array);
}

void countnprint(int index, int * array_temp, char *string_temp, int length_temp) {

    int total = 0;

    for (int i = 0; i <= index; i++)
    {
        total += array_temp[i];
    }
    index =+ 1;
    for (int i = index; i < length_temp; i++)
    {
        if(string_temp[i] == 'R') {
            total += length_temp - ((int)i + 1);
        } else if (string_temp[i] == 'L') {
            total += (int) i ;
        }
    }
    printf("%d ", total);
    total = 0;
}