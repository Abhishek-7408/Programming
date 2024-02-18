import java.util.Scanner;

public class swapfunction {
    public static void swap(int x,int y){
        int t;
        t=x;
        x=y;
        y=t;
        System.out.println("Inside swap function: a = " + x + ", b = " + y);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        swap(a,b);
    }
}
