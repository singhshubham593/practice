package fun;

import java.util.Scanner;

public class even {
    public static void main(String arg[]){
        Scanner tk=new Scanner(System.in);
        int num =tk.nextInt();
        System.out.println(isEven(num));
       //boolean a= isEven(5);
        //System.out.println(a);
        //System.out.println(isEven(5));
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
