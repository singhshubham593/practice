 class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
public class encapsulation {
    /*
    // name variable is declared as private, we cannot access it from outside this class:
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error
    }
     */
    // name variable is declared as private, we can access it from outside this class:

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());//john
    }
}
