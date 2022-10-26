public class PrettyPrinting {
    public static void main(String[] args) {
        // Two digit and rounded after the decimal
        float a = 43.54445f;
        System.out.printf("Formated number is %.2f",a);    //%.Noof digit after decimal f
        System.out.println();
        System.out.printf("pie: %.2f",Math.PI);
        System.out.println();
        // using format specifier
        System.out.printf("Hello ,My name is %s and I am from %s","shubham","Buxar");
        /*
        //
Specifier	Description
%b, %B	    "true" or "false" based on the argument
%s, %S	     a string
%c, %C	     a Unicode character
%d	         a decimal integer (used for integers only)
%o	         an octal integer (used for integers only)
%x, %X	     a hexadecimal integer (used for integers only)
%e, %E	     for scientific notation (used for floating-point numbers)
%f	         for decimal numbers (used for floating-point numbers)
         */
    }
}
