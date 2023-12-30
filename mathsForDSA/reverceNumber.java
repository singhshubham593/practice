// reverce number using extraction
public class reverceNumber {
    public static void main(String[] args) {
        int num=2467;
        // store funtion call valve in a variable
        int reverseNo=reverse(num);
        System.out.println(reverseNo);
    }
    // function for reverse number
    static int reverse(int num){
        // num is for store reverse no
        int number=0;
        //    2467>0
        while (num>0){
            //    7     = 2467%10
            int lastDigit=num%10;
            // 7 =(0*10)+7
            number=(number*10)+lastDigit;
            //  246=2467/10
            num=num/10;
        }
        // return the reverse no that store in number
        return number;
    }
}
