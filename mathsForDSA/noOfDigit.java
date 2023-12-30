//Number of digit
public class noOfDigit {
    public static void main(String[] args) {
        int num=2467;
        countDigit(num);

    }
    // function for count no of digit
    static void countDigit(int num){
        int count=0;
        //     2467>0
        while (num>0){
            // count= 0+1
            count=count+1;
            // 246=2467/10
            num=num/10;

        }
        //to print count after complite counting
        System.out.println(count);
    }
}
