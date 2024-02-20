
public class string {
    public static void main(String[] args) {
char c = 'c';
String str = "abcdefgh";
System.out.println(str.charAt(5));
//System.out.println(str[0]); incorrect
System.out.println(str.length());
System.out.println(str.substring(1, 6));
System.out.println(str.substring(3));
System.out.println(str.substring(0));
System.out.println(str.substring(1,1));//0
System.out.println(str.contains("cde"));
    }
}
