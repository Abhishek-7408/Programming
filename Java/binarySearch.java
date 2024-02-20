public class binarySearch {
    public static int binarySearchJ(int input[],int element){
        int start=0;
        int end=input.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(element==input[mid]){
                return mid;
            }
            else if(element>input[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int input[]={2,5,8,7,32,88,99,100,101,105,500};
        int index = binarySearchJ(input, 8);
        System.out.println("Element Found at Index:"+index);
    }
}
