import java.util.Scanner;

public class primechk {
    public static boolean isPrime(int n){
        int d=2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean ans= isPrime(n);
       System.out.println(ans);
    }
}
