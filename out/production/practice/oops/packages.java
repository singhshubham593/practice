// Build-in package.
import java.util.Scanner;
//import package.name.Class;   // Import a single class
//import package.name.*;   // Import the whole package

// package are divided into two categories.
// 1.built in package
//2. user defined package


class packages {
    // 1. build in package
    // import a class

   // Scanner class to get user input:
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
/*
 //user-defined package.

package mypack; // mypack is user define package.

class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is User defined package!");
    }
}
 */






