import java.util.Scanner;

public class arrayincre {

public static void increment(int n[]){
    for(int i=0;i<n.length;i++){
        n[i]++;
    }
}


    public static int[] takeInput(){
        Scanner s =new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i=0;i<size;i++){
             input[i]=s.nextInt();
        }
        return input;

        }

        public static void print(int input[]){
            int size=input.length;
            for(int i=0;i<size;i++){
                System.out.print(input[i]+" ");
            } 
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        increment(arr);
        print(arr); 


    }
}
