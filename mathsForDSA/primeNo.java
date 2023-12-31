// prime no using factore method
public class primeNo {
    public static void main(String[] args) {
        int num=31;
        int count=0;
        /*
        // normal approach
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
         */
        // brute force approach or optimise approach
                // i*i<=n is equal to i<=sqrt(n)
        for (int i=1;i*i<=num;i++){
            if(num%i==0){
                count=count+1;
                if((num/i)!=i){
                    count=count+1;
                }
            }
        }
        if (count==2){
            System.out.println("prime no");
        }else{
            System.out.println("not prime");
        }
    }
}
