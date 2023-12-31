// to chack no is armostrong or not
public class armostrongNo {
    public static void main(String[] args) {
        int num=371;
        int cop=num;
        int number=0;
        while (num>0){
            // 1=371%10
            int lastDigit=num%10;
            // 1  =0 + (1*1*1)
            number=number+(lastDigit*lastDigit*lastDigit);// note:if num is 4 digit than formula is lastDigit multiply 4 times
            // 37=371/10                        // IMPORTANT note:if num is n digit than formula is lastDigit multiply n times
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
