import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int i=10;
         System.out.println(i);
         int n =4;
         System.out.println(n);
         i=1;
         while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
         }


         
    }
}
