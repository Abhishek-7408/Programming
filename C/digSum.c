#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int sum=0;
    while(n!=0){
        int r = n%10;
        sum+=r;
        n/=10;
    }
    printf("%d",sum);
}