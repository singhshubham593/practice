public class arrayrotate {
    public static void main(String[] args) {
        int[] nums={3,5,7,9};
        int k=2;
        // for how many times k will be sift.
        for(int i=0;i<=k;i++){
            System.out.println(leftswap(nums));
        }
    }

     static int leftswap(int[] nums) {
        int temp=nums[0];
        //for moving 5,7,9 in left side.
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
        return nums[nums.length-1];
    }
}
