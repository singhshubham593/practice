/*

    COLOUM
    ******
  R *****
  O ****
  W ***
    **
    *
 */
public class pattern3 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int coloum=1;coloum<=n-row+1;coloum++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
