/*
leetcode : 1672 :Richest Customer Wealth
 You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i th customer has in the j th bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


        Input: accounts = [[1,11,3,4],[1,3,6,4],[3,5,7,9]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 11 + 3 + 4= 19
        2nd customer has wealth = 1 + 3 + 6 + 4 = 14
        3nd customer has wealth = 3 + 5 + 7 +9= 24
        customers are considered the richest with a wealth of 24, so return 24.
*/
public class richCustWealth {
    public static void main(String[] args) {
        int[][] arr={{1,11,3,4},
                   {1,3,6,4},
                   {3,5,7,9}
        };
         int as=rich(arr);
        System.out.println(as);
    }
    static int rich(int[][] arr){
        int max=0;
        for (int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = 0; j <arr[i].length; j++) {
                sum +=arr[i][j];
            }
             max=Math.max(max,sum);
        }
        return max;
    }

}
