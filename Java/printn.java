import java.util.Scanner;

public class printn {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Range");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println(i);
            }

        }
}
