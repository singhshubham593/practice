public class conceptOfRecursion {
    //write a function that take in a number and print it
    //print first 4 number : 1234
    /*

    public static void main(String[] args) {
        //write a function that take in a number and print it
        //print first 4 number : 1234
        print1(1);
    }
    //functjion call another function
    //body and definition are same,but only name is different.
    //while the function is not finished executing,it will remain in stack.
    //while the function is finished executing,it is remove from stack and the flow of program is restored to where the function is called.
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
    }
    */
    public static void main(String[] args) {
        // fun call
        print1(1);
    }
    static void print1(int n){
        //base condition:condition where our recursion will stop making new call
        // If No base condition:fun call never end and memory is exceed the limit
        if(n==5){
            return;
        }
        System.out.println(n);
        //Recursive call
        //if you are calling a function again and again,you treat it as a separate call in the stack
        // and separate memory is allocated for every function


        //this is called tail recursion
        //this is the last function call
        print1(n+1);

    }
}
