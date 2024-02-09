import java.util.Scanner;

public class sumnumbers {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Range");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
