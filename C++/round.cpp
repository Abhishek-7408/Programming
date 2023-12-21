#include <iostream>
#include <cmath>
using namespace std;
int main(){
    double x,y;
    cin>>x>>y;
    double result = x/y;
     double decimalPlace = round(result*10)/10;
     int convertPlace = round(result);
     cout<<convertPlace;
     return 0;
}