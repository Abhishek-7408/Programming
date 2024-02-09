import java.util.Scanner;

public class maxofThree {
public static void main(String[] args) {
    System.out.println("Enter numbers");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
        System.out.println("a is largest");
    }
    if(b>a && b>c){
        System.out.println("b is largest");
    }
    else{
        System.out.println("c is largest");
    }

    
}
}
