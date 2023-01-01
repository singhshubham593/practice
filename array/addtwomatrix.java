import java.util.Scanner;
   //addition of two matrix
public class addtwomatrix {
    public static void main(String[] args) {
        int m, n, c, d; //m=row, n=column , c=d=index of matrix
        // using scanner(class or constractor) for taking input
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix::");
        // taking value of row and column.
        m = in.nextInt();// row
        n = in.nextInt();// column
        // storing value of row and column in matrix
        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first matrix::");
        //for element in first matrix.
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix::");
        //for element in second matrix
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                second[c][d] = in.nextInt();

        // for add two matrix
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of entered matrices::");
        // printing sum of matrix
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++)
                System.out.print(sum[c][d] + "\t");

            System.out.println();
        }
    }
}
