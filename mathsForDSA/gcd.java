// gcd
public class gcd {
    public static void main(String[] args) {
        int a=52,b=10;
        /*
        // first approach
        int gcds = 1;
        for (int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcds=i;
            }
        }
        System.out.println(gcds);
         */
        /*
        // 2nd approach
        for (int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
         */
        // using eucliden Algorithm
        /*
         a>b
         gcd(a,b)==gcd(a%b,b)
           (greater%smaller)->one of them is zero,the other is gcd
         */
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }else {
                b=b%a;
            }
        }
        if(a==0){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
}
