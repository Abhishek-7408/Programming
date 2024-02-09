import java.util.Scanner;

public class sicalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = (p*r*t)/100;

        System.out.println("SI is:\n"+si);


    }
}
