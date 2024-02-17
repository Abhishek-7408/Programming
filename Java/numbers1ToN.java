import java.util.Scanner;

public class numbers1ToN {
    public static void print(int n){
        if(n<=0){
            return;
        }
        for(int i=1;i<=n;i++){
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
    }
}
