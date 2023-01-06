public class binaryUsRecursion {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9};
        int target=9;
        System.out.println(search(target,arr,0,arr.length-1));
    }
    static int search(int target,int[] arr,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]) {
            return search(target,arr,s,e-1);

        }

        return search(target,arr,s+1,e);
    }
}
