/*

// Question pattern

  COLOUM
     _ _ _ _ _
   | * * * *
 R | * * * *
 O | * * * *
 W | * * * *
   | * * * *

 */

public class pattern2 {
    public static void main(String[] args) {
        //function call
        pattern2(5);
    }
    // For pattern design
    static void pattern2(int n){
        //for row
        for ( int row = 1; row <= n ; row++){
            // for every row,run the coloum
            for ( int col = 1; col <= 4 ; col++){
                // print Star
                System.out.print("* ");
            }
            // for next line after coloum loop is end
            System.out.println("");
        }
    }
}
