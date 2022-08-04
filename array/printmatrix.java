import java.util.Scanner;

public class printmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] number = new int[row][col];
       //Input
        //row;
        for(int i=0; i<row;i++){
            //coloum
            for(int j=0;j<col;j++){
             number[i][j] =sc.nextInt();
            }
        }
         // output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
