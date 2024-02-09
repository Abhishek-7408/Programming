import java.util.Scanner;

public class printNnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Natural numbers are:");
            System.out.println(i);
        }
    }
}
