import java.util.Scanner;

public class Search {
    public static int LinearSearch(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result = LinearSearch(arr,target);
        if(result!=-1){
            System.out.println("Element Found at index"+result);


        }
        else{
            System.out.println("Element Not Found ");

        }


    }
    
}
