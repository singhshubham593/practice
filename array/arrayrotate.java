public class arrayrotate {
    public static void main(String[] args) {
        int[] nums={3,5,7,9};
        int k=2;
        for(int i=0;i<=k;i++){
            leftswap(nums);
        }
    }

     static void leftswap(int[] nums) {
        int temp=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[1]=nums[i+1];
        }
        nums[nums.length-1]=temp;
    }
}
