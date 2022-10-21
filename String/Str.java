public class Str {
    public static void main(String[] args) {
        //concatenation
        String firstFame = "Shubham";
        String lastName = "Singh";
        String fullName = firstFame + " " + lastName; // addition of two string
        System.out.println(fullName);

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i)); // for index 0 to n ,to print all world
        }
        // Comprare
        String name1 = "Sonny";
        String name2 = "sonny";

        // case1 : s1>s2 : +ve value
        //case2 : s==s2 :0
        //case3 : s1<s2 :-ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal.");
        } else {
            System.out.println("String are not equal.");

        }
    }
}