package fun;
// to chack the given no is prime or not using function.
public class isprimeNo {

    public static void main(String[] argu){
        System.out.println(check(7));
    }
    /*
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

     */
    //optimised solution
    public static boolean check(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
