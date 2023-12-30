// Extraction of digit from number
public class extractionOfDigit {
    public static void main(String[] args) {
     int num=2467;
     //    2467>0
     while(num>0){
         //    7     = 2467%10
         int lastDigit= num%10;
         // print 7
         System.out.println("the digit is :"+lastDigit);
         //  246=2467/10
         num=num/10; // extract all digit in reverce order.
         // then again condition chack start.
     }
    }
}
