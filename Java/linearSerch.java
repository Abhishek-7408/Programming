import java.util.Scanner;

public class linearSerch {
    public static int linearSearch(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        size = sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target;
        System.out.println("Enter Target Element");
        target = sc.nextInt();

        int res = linearSearch(arr, target);
        if(res!=-1){
            System.out.println("Element found at index:"+res);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
