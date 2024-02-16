import java.util.Scanner;
public class increamentDecreament {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a=10;
        System.out.println(a++);
        System.out.println(a);


        System.out.println(++a);
        a=4;
        a*=2;
        System.out.println(a);
        a^=2;

        System.out.println(a);
        int ans2 = 2+3*4;
        System.out.println(ans2);
        int ans = 2* 3/2;
        System.out.println(ans);

        a++;
        ++a;
        System.out.println(a);
    }
}
