import java.util.Arrays;

public class searchIn2darr {
    public static void main(String[] args) {
        int[][] arr={
                {34,56,78},
                {32,67,87,54},
                {44,24,77},
        };
        int target =77;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row =0;row <arr.length;row++){
            for(int col=0; col < arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
