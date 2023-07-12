

// pattern question
/*
      COLOUM
      _ _ _ _ _
   |      *
 R |     * *
 O |    * * *
 W |   * * * *
   |  * * * * *

 */
public class pattern4 {
    public static void pyramidPattern(int n) {
        int i;
        for (i = 1; i < n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }
            System.out.println(" "); //print space
        }
    }
    public static void main(String argu[]){
        pyramidPattern(6);
    }

}