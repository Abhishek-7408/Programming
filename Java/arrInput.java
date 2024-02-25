import java.util.Scanner;

public class arrInput {
    public static void main(String[] args) {
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

    for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
            System.out.print(input[i][j]+" ");
        }
        System.out.println();
    }


    }
}
