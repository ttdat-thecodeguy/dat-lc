package t7_home;

public class P204_CountPrimes {

    /*
    Given an integer n, return the number of prime numbers that are strictly less than n.



Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0


Constraints:

0 <= n <= 5 * 106
     */


    public int countPrime(int n) {
        //Sieve of Eratosthenes
        boolean prime[] = new boolean[n+1];
        for (int i = 0; i<= n;i++) prime[i] = true;
        //mark it
        for (int p = 2; p * p <= n;p++) {
            if (prime[p] == true) {
                for (int j = p * p; j <= n;j+=p) {
                    prime[j] = false;
                }
            }
        }
        //
        int result = 0;
        for (int i = 2; i<n;i++) {
            if (prime[i]==true)result++;
        }
        return result;


    }



}
