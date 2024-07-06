package t6.repeat;

public class P633_SumOfSquare {
    /*
        Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
        Example 1:

        Input: c = 5
        Output: true
        Explanation: 1 * 1 + 2 * 2 = 5
        Example 2:

        Input: c = 3
        Output: false

        https://leetcode.com/problems/sum-of-square-numbers/
    */

    public static boolean judgeSquareSum(int c) {
        int l = 0;
        int r = (int) Math.sqrt(c);
        while (
            l <= r
        ) {
            int sum = (int) (Math.pow(l, 2) + Math.pow(r, 2));

            if (sum == c) {
                return true;
            }

            if (sum > c) {
                r--;
            } else {
                l++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(3));
    }
}
