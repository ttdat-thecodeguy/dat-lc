package t7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class P5_LongestPalindromic {
  /*
  Given a string s, return the longest
  palindromic  substring (la mot chuoi co the doc tu cuoi va tu dau giong nhau)   in s.

  Example 1:

  Input: s = "babad"
  Output: "bab"
  Explanation: "aba" is also a valid answer.
  Example 2:

  Input: s = "cbbd"
  Output: "bb"


  Constraints:

  1 <= s.length <= 1000
  s consist of only digits and English letters.
  */

  public static void main(String[] args) {
    /// test case
  }

  @Test
  public void Test() {
    assertEquals(longestPalindrome("cbbd"), "bb");
    assertEquals(longestPalindrome("abc"), "");
    assertEquals(longestPalindrome("aghcea"), "");
  }
  public String longestPalindrome(String s) {
    for (int length = s.length(); length > 0; length--) {
      for (int start = 0; start <= s.length() - length; start++) {
        if (check(start, start + length, s)) {
          return s.substring(start, start + length);
        }
      }
    }

    return "";
  }
  public boolean check (int i, int j, String s) {
    int l = i;
    int r = j - 1;
    while (l < r) {
      if (s.charAt(l) != s.charAt(r)) return false;
      l++;
      r--;
    }
    return true;
  }

  public String wrongS1(String s) {
    int i = 0, j = s.length() - 1;
    String result = "";
    while (i <= j) {
      if (s.charAt(i) != s.charAt(j)) {
        result = s.substring(i).substring(j, s.length() - 1);
      }
      i++;
      j++;
    }
    return result;
  }

}
