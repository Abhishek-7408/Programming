
public class primeBetweenN {
    public static boolean isPrime(int n){
        int d =2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void print(int n){
        for(int i=2;i<=n;i++){
           boolean isIPrime=isPrime(i);
           if(isIPrime){
            System.out.println(i);
           }

            //need to check if i is prime or not

        }
    }
    public static void main(String[] args) {
       print(100);
    }
}
