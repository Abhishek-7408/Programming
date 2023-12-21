import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int x,y,gcd;
        gcd = 1;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        for(int i=1; i<=x&&i<=y;i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
        }
        System.out.printf("Gcd of %d and %d is %d",x,y,gcd);

    }
}
