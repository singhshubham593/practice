package fun;
// find prime no between 2 to 20.
public class rangeOfPrimeNo {
    public static void main(String[] argu){
        //range(20);
        range(20);
    }
    // normal function
    public static boolean check(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void range(int n) {
         for(int i=2;i<=n;i++){
             if(check(i)){
                 System.out.print(i+" ");
             }
         }
    }
}
