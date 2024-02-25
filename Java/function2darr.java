import java.util.Scanner;

public class function2darr {

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns:");
        int column=sc.nextInt();
        int input[][] = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.println("ENter element at i row and i column");
                input[i][j]=sc.nextInt();
            }
        }
        return input;
    }

    public static void print(int[][] input){
int rows=input.length;
int column=input[0].length; 
        for(int i =0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }
    



        public static void main(String[] args) {
        int input[][]=takeInput();
        print(input);
            
        }




}
