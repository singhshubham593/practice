// to check given array is decrease or nondecrease,
public class nondecreasingArr {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean a=nonDecreasArr(arr);
        System.out.println(a);
    }
    static boolean nonDecreasArr(int[] arr){
        int poss=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                if(poss!=-1){
                    return false;
                }
                poss=i;
            }
        }
        return poss==-1 || poss == 0 || poss == arr.length-2 || arr[poss-1]<=arr[poss+1] || arr[poss]<=arr[poss+2];
    }
}
