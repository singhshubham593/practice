public class max {
    public static void main(String[] args) {
        int[] arr={2,4,5,6};
        System.out.println(nums(arr));

    }
    static int nums(int[] arr){
        int maxVal =arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
