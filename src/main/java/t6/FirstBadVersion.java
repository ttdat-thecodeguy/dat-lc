package t6;

public class FirstBadVersion {


    /*
    You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check.
    Since each version is developed based on the previous version, all the versions after a bad version are also bad.

    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

    You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
    Example 1:

    Input: n = 5, bad = 4
    Output: 4
    Explanation:
    call isBadVersion(3) -> false
    call isBadVersion(5) -> true
    call isBadVersion(4) -> true
    Then 4 is the first bad version.
    Example 2:

    Input: n = 1, bad = 1
    Output: 1
     */

    private boolean isBadVersion(int n) {
        return n % 2 == 1;
    }

    // approach : binary search
    // explain :
    // - because if this is a bad version, after this is bad version => find mid => remove after that
    // - if is the good version => before that is good version
    // - minimize call apis


    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2; // (l + r) / 2 // remove left because version is good
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }


}
