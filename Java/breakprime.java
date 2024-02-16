import java.util.Scanner;

public class breakprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d =2;
        boolean divided = false;
        while(d<n){
            if(n%d==0){
                divided=true;
                break;
            }
            d=d+1;

        }
        if(divided){
            System.out.println("Not prime");

        }
        System.out.println("Prime");
    }
}