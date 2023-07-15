package fun;
// convert binary to decimal
public class binToDecimal {
    public static void main(String[] args) {
        binToDec(101);
    }
    public static void binToDec(int bin){
        int pow=0;
        int dec=0;
       while(bin>0){
           int ld=bin%10;
           dec=dec +(ld*(int)Math.pow(2,pow));
           pow++;
           bin=bin/10;
       }
        System.out.println("The binary of 101 is " + dec);
    }
}
