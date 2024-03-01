import java.util.Scanner;

public class largestColumnSum {
    public static int[][] takeArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int input[][]= new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                input[i][j]=sc.nextInt();
        
            }
        }
        return input;
        
        
    }

public static void printInput(int arr[][]){
    int rows = arr.length;
    int col = arr[0].length;
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
    }
}
public static int largestColSum(int input[][]){
    int largest = Integer.MIN_VALUE;
    int rows = input.length;
    int col = input[0].length;

    for(int i=0;i<col;i++){
        int sum=0;
        for(int j=0;j<rows;j++){
            sum = sum+input[j][i];
        }
        if(sum>largest){
            largest=sum;
        }

    }
    return largest;

    
}

public static void main(String[] args) {
    int input[][]=takeArray();
    printInput(input);
    largestColSum(input);
   
    System.out.println("Largest col sum:"+largestColSum(input));
}



}
