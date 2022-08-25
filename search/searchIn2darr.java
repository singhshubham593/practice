import java.util.Arrays;

public class searchIn2darr {
    public static void main(String[] args) {
        // 2d array initialise and declared
        int[][] arr={
                {34,56,78},
                {32,67,87,54},
                {44,24,77},
        };
        // number search a position.
        int target =77;
        // initialise function call in a variable.
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        // running loop for row.
        for(int row =0;row <arr.length;row++){
            // running loop for column.
            for(int col=0; col < arr[row].length;col++){
                //searching target in 2d array.
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        // if target is not found in 2d array.
        return new int[]{-1,-1};
    }
}
