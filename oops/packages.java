// Build-in package.
import java.util.Scanner; //import package.name.Class;   // Import a single class
                          //import package.name.*;   // Import the whole package

class packages {
    // import a class

   // Scanner class to get user input:
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}



