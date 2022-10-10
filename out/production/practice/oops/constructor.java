// Create a constructor
/*
// 1. Create a constructor class
public class constructor {

     int x;  // Create a class attribute

    // Create a class constructor for the constructor class
     public constructor() {
            x = 5;  // Set the initial value for the class attribute x
     }

     public static void main(String[] args) {
            constructor myObj = new constructor(); // Create an object of class constructor (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
     }
}
// Outputs 5
 */
/*
//// this constructor present in c++
// 2. Creating copy constructor.
class_name(construct class_name and job)
pen(pen pen2){
this.color =pen2.color;
this.type =pen2.type;
}
 */

// 3. Create a constructor parameter
public class constructor {
    int x;

    public constructor(int y) {// parameter in constructor
        x = y;
    }

    public static void main(String[] args) {
        constructor myObj = new constructor(5);// passing value in constructor
        System.out.println(myObj.x);
    }
}

// Outputs 5