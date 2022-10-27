public class operator{
    public static void main(String[] args) {
        // Add to ascii value
        System.out.println('a' + 'b');  // ascii value of a=97 and b=98 is 195
        // Concatenation String
        System.out.println("a"+"b");  // a + b = ab   // in this case,we cannot use substraction,otherwise it give error
        System.out.println("a"+1);  // a + 1 = a1    // in this case,we cannot use substraction,otherwise it give error
        //add value in ascii
        System.out.println('a'+3);   //ascii value of a=97 + 3 is 100
        // convert value in ascii
        System.out.println((char)('a'+3));  // convert it into ascii
    }
}
