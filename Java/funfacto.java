import java.util.Scanner;

public class funfacto {
    public static int factorialFunction(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans = ans*i;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int num=factorialFunction(n);
        int den1=factorialFunction(r);
        int den2=factorialFunction(n-r);
        int ans = num/(den1*den2);
        System.out.println(ans);

    }
}
