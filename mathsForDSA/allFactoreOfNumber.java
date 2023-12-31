// all factore of given
public class allFactoreOfNumber {
    public static void main(String[] args) {
        int n=36;
        /*
        // normal approach
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
         */
        // optimise approach or brute force approach
        //          i*i<=n is equal to i<=sqrt(n)
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                // 1,2,3,4,6
                System.out.println(i);
                if((n/i)!=i){
                    // 36,18,12,9
                    System.out.println(n/i);
                }
            }

        }
    }
}
