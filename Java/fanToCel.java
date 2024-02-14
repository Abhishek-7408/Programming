import java.util.Scanner;

public class fanToCel {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int fan = sc.nextInt();
    //int cel = (5/9)*(fan-32);
    int cel = (5 * (fan-32))/9;
    // int cel = (int)((5.0/9)*(f-32));
    System.out.println(cel);
    System.out.println(5/9);
    System.out.println(9.0/5);
    }
}
