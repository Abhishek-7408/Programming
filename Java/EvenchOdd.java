import java.util.Scanner;

public class EvenchOdd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = n%2;
        if(rem==0){
            System.out.println("Even");
return;
        }
        else{
            System.out.println("Odd");
        }
        System.out.println("Hello");
        
    }
}
