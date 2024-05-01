#include <stdio.h>
#include <math.h>
#include <stdbool.h>

int main() {
    long long int n;
    long long int k;
    bool evenflag = false;
    long long int key;
    
    scanf(" %lld%lld", &n, &k); 
    long long int mid = ceil((long double)n / (long double)2);
    long long int even = 0;
    long long int odd = 1;

    if(k > mid) {
        key = k - mid;
        evenflag = true; //even
    } else {
        key = k;
        evenflag = false; //odd
    }
    
    if (evenflag)
    {
        even = key * 2;
        printf("%lld", even);
    } 
    else 
    {
        odd = k * 2 - 1;
        printf("%lld", odd);
    }
    
    

    // if(evenflag) {
    //     for (int i = 0; i < key; i++) //999999999997 499999999999
    //     {
    //         even += 2;
    //         printf("hello1 i is %d key = %d\n",i, key);
    //     }
    //     printf("%lld", even);
    // } else {
    //     for (int i = 1; i < key; i++)
    //     {
    //         odd += 2;
    //         printf("hello2 i is %d key = %d\n",i, key);
    //     }
    //     printf("%lld", odd);
    // }
    
    return 0;
}