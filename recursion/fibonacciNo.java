public class fibonacciNo {
    //finding fibonacci number -->0,1,1,2,3,5,8,13,21....
    public static void main(String[] args) {
        //fun initialise a value
        int ans=fibo(7);
        //fun call as value initialise
        System.out.println(ans);
    }
    // return type is Integer
    static int fibo(int n){
        // base condition--> in this case--> f(0)=0,f(1)=1
        if(n<2){
            return n;
        }
        //{fibo(n)=fibo(n-1)+fibo(n-2)}->break a problem into small problem
        return fibo(n-1)+fibo(n-2);//{fibo(n)=fibo(n-1)+fibo(n-2)}->Recurance Relation
    }
}
