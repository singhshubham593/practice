// Reverse the string  word wise
public class reverseStr {
    public static void main(String[] args) {
        String s=(" THe  sky    is blue ");
        System.out.println(strBuilder(s));
    }
    static String strBuilder(String s){
        String[] words=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            if(words[i].length()>0){
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}
