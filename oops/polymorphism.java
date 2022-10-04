// polymorphism;
public class polymorphism { // polymorphism = animal
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
// Extend class of anilmal
class Pig extends polymorphism {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends polymorphism {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}