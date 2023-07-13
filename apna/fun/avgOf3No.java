package fun;

import java.util.Scanner;

public class avgOf3No {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int a= tc.nextInt();
        int b= tc.nextInt();
        int c= tc.nextInt();

        //float a=9;
        //float b=6;
        //float c=1;
        System.out.print(avg(a,b,c));
    }

    public static float avg(float a,float b,float c) {
        float average=(a+b+c)/3;
        return average;
    }

}
