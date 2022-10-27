import java.util.Locale;
// to check given char is palindrome or not;
public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcbA";
        // fuctio call
        System.out.println(palindrome(str));
    }
    // creating new function
    static boolean palindrome(String str){
        // to convert all charector in small
        str = str.toLowerCase();
        // run loop to check character
        for(int i =0; i<=str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            //condition
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
