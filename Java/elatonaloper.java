import java.util.Scanner;

public class elatonaloper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        boolean isEq = (i==j);
        boolean isGr = (i>j);
        boolean isGrEq = (i>=j);
        boolean isLess = (i<j);
        boolean isLessEq = (i<=j);
        boolean isNotEq = (i!=j);

        System.out.println("IS eq "+isEq);
        System.out.println("IS greater "+isGr);
        System.out.println("IS Greater  "+isGrEq);
        System.out.println("Is less "+isLess);
        System.out.println("Is less equal "+isLessEq);
        System.out.println("Is not equal "+ isNotEq);





        
        

    }
}
