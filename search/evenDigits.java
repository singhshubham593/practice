public class evenDigits {

    // Given an  array nums of integers,return how many of contain an even number of digits.

    public static void main(String[] args) {
        int[] nums = {12, 356, 7895, 34567};

        System.out.println("The even number of digits is " + findNumber(nums)+".");
    }
    //function to find even number in array.
    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        //to check even or not.
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    //function to count the number of digits.
    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
