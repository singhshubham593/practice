import java.util.Arrays;

// matrix diagonal sum
/*
 ( 1+5+9+7+3=25)
 */
public class matrixDiagSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9},  };
        System.out.print(" The sum of diagonal is :");
        System.out.println(diaSum(arr));

    }
    static int diaSum(int[][] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum = sum + (arr[i][i] + arr[i][n-i-1]);
        }
        if(n%2==0){
            return sum;
        }else{
            return sum-arr[n/2][n/2];
        }
    }
}
