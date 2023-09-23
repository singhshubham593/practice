//Running sum of 1d Array From leetcode question no 1480
public class runSumArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int ans=arr[0];
        int as =sum(arr,ans);
        System.out.println(as);
    }
    static int sum(int[] arr,int ans){
        for (int i=1;i<arr.length;i++){
            System.out.println(ans);
            ans=ans+arr[i];
        }
        return ans;
    }
}
