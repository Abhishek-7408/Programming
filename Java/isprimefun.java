import java.util.Scanner;

public class isprimefun {
    public static int isPrime(int n){
        int d=2;
        for(int i=1;i<n-1;i++){
            if(n%d==0){
                System.out.println("Not Prime");

            }
            else{
                System.out.println("Prime");

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

    }
}
