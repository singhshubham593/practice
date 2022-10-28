public class Performace {
    public static void main(String[] args) {
        /*
        //in this case,loop run and Creating new Obejct again and again And O(n*2) time complexsity,to solve thin String Builder is come
        String series = "";
        for(int i=0;i<26;i++){
            char ch =(char) ('a'+i);
            series =series +ch;
        }
        System.out.println(series);
       // Result = abcdefghijklmnopqrstuvwxyz
         */
        //in this case,loop run and Obejct value hange again and again
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch =(char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
