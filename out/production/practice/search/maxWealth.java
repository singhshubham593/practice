public class maxWealth {
    /*
    leetcode Question.
    1672.Richest Customer Wealth.
    que- you are given an m*n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth
         bank.Return the wealth that the richest customer has.
     */
    public static void main(String[] args){
        int [][] acounts = {{1,5},
                            {7,3},
                            {3,5} };
        System.out.print("THe richest person is ");
        //function call and print
        System.out.print(maximumWealth(acounts));
    }
    static int maximumWealth(int[][] acounts){
        // person =row
        //acount =col
        int ans = Integer.MIN_VALUE;
        for(int person = 0;person<acounts.length;person++){
            //when you start a new col, take a new sum for that row
            int sum =0;
            for(int acount = 0;acount<acounts[person].length;acount++){
                sum +=acounts[person][acount];

            }
            //now, we have to sum of acount of person
            //check with overall ans
            if(sum>ans){
                ans =sum;
            }
        }
        return ans;
    }
}
