/*
     COLOUM
      _ _ _ _ _
   | A
 R | B C
 O | D E F
 W | G H I J
   | K L M N O
 */
public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        // for loop use for 4 row
        for(int line=1;line<=n;line++){
            /* for loop use row 1 coloum 1
                            row 2 coloum 2
                            row 2 coloum  3
                            '''''''''''''''
             */
            // ch is for ABCD.. And chars is for position of ABC with respect to coloum
            for(int chars=1;chars<=line;chars++){
                // to print A B C D E.....
                System.out.print(ch+" ");
                // afte print A increace to B,B to C,....
                ch++;
            }
            //
            System.out.println();
        }
    }
}
