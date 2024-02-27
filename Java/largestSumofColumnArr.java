public class largestSumofColumnArr {
    
public static int largestcolsum(int input[][]){
int largest=Integer.MIN_VALUE;
int rows = input.length;
int column=input[0].length;
for(int j=0;j<column;j++){
    int sum=0;
   for(int i=0;i<rows;i++){
sum = sum+input[i][j];



   } 

   if(sum>largest){
    largest = sum;
   }
}
return largest;





}


public static void main(String[] args) {
    
}



}
