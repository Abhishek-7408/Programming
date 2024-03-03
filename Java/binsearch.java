import java.util.Scanner;

public class binsearch {

public static int binarySearch(int arr[],int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid = (start+end)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            start = mid+1;
        }
        else{
            end=mid-1;
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

        int res = binarySearch(arr, target);
        if(res!=-1){
            System.out.println("Element found at index:"+res);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
