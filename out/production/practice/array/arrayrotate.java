import java.util.Arrays;

// to rotate array in right side k times
public class arrayrotate {
    public static void main(String[] args) {
        int[] nums={3,5,7,9};
        slide(nums,3);// function call
        System.out.println(Arrays.toString(nums));
    }
    static void slide(int[] nums,int k){
        k=0;//k==no of index slide
        // for how many times k will be sift.
        for(int i=0;i<=k;i++){
             leftswap (nums);//function call
        }
    }
        // to swap array in left side in array
     static int leftswap(int[] nums) {
        int temp=nums[0];
        //for moving 5,7,9 in left side.
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        //to swap index with using temp and
        nums[nums.length-1]=temp;
        return nums[nums.length-1];
    }
}
