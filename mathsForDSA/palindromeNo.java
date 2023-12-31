//palindrome no or not
public class palindromeNo {
    public static void main(String[] args) {
        int num=243;
        int cop=num;
        int number=0;
        while (num>0){
            int lastDigit=num%10;
            number=(number*10)+lastDigit;
            num=num/10;
        }
        //chack given no is equal to reverse no or not
        if(cop == number){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
