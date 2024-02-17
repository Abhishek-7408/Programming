import java.util.Scanner;

public class factorialFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            num*=i;
        }

        int den1=1;
        for(int i=1;i<=r;i++){
            den1*=i;
        }
        int den2=1;
        for(int i=1;i<=n-r;i++){
            den2*=i;
        }
        int ans = num/(den1*den2);
        System.out.println(ans);
    }
}
