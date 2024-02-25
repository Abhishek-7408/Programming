import java.util.Scanner;

public class stringPrefexes {
    public static void printPrefix(String str){
for(int i=0;i<str.length();i++){
    System.out.println(str.substring(0, i+1));
}
 






    }
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        printPrefix(s);
        
    }
}
