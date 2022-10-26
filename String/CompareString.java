public class CompareString {
    public static void main(String[] args) {

  // variable is different for same value.but,result is true.

        String a ="Shubham";
        String b = "Shubham";
        System.out.println(a==b);

 // creating different object for same value.but,result is false.

        String name1 = new String("shubham");
        String name2 = new String("shubham");

        System.out.println(name1==name2); // comparator is ==. and result is false

        System.out.println(name1.equals(name2)); // .equal() is method or fuction.and resuit is true
    }
}
