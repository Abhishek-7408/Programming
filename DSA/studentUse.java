import java.util.Scanner;

// public class oop{
//     String name;
//     int rollNo;
//     int age;
// }


public class studentUse {

   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Student s1=new Student();
         s1.name = "Abhishek";
         s1.setRollno(2409);
         


        System.out.println(s1.getRollNo());
        System.out.println(s1.name); 
    }
}
