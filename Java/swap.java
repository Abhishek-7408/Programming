import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,t;
        System.out.println("Enter Numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
        t = x;
        x = y;
        y = t;
        System.out.println("After Swap \n"+x+"\n"+y);

    }
}
