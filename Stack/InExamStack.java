public class InExamStack {
    public static void main(String[] args){
        int a[]={2,3,8,9,5};
       push(a,3,3);
    }
    static int push(int[] a, int top, int size){
        if(top==size-1){
            System.out.println("overflow");
        }
        else{
            top=top+1;
            System.out.println(a[top]);
        }
        return 1;
    }
}
