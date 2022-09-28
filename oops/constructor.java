// Create a constructor class
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
// Outputs 5
}
