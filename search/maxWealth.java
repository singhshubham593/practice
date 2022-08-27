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
        System.out.println(maximumWealth(acounts));
    }
    static int maximumWealth(int[][] acounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0;person<acounts.length;person++){
            int sum =0;
            for(int acount = 0;acount<acounts[person].length;acount++){
                sum +=acounts[person][acount];

            }
            if(sum>ans){
                ans =sum;
            }
        }
        return ans;
    }
}
