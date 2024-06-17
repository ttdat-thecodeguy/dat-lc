package t6;


/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.



Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
*/

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum2Point(3));
    }

    public static boolean judgeSquareSum2Point(int c) {
        int start = 0;
        int end = (int) Math.sqrt(c);
        while (start <= end) {
            double sum = Math.pow(start, 2 ) + Math.pow(end,  2);
            if (sum == c) return true;
            else if (sum > c) end--;
            else start--;
        }
        return false;
    }

}
