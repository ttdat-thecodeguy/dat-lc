package t7;

public class P28_FindIndexOfFirstOccurString {
  /*
  origin: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
  Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
  Example 1:

  Input: haystack = "sadbutsad", needle = "sad"
  Output: 0
  Explanation: "sad" occurs at index 0 and 6.
  The first occurrence is at index 0, so we return 0.
  Example 2:

  Input: haystack = "leetcode", needle = "leeto"
  Output: -1
  Explanation: "leeto" did not occur in "leetcode", so we return -1.
  */

  public static void main(String[] args) {
    System.out.println(strStr("mississippi", "issip"));
  }

  public int solution(String haystack, String needle) {
    int hLen = haystack.length();
    int nLen = needle.length();

    if (nLen == 0) {
      return 0;
    }

    for (int i = 0; i <= hLen - nLen; i++) {
      if (haystack.substring(i, i + nLen).equals(needle)) {
        return i;
      }
    }
    return -1;
  }


  public static int strStr(String haystack, String needle) {
    int j = 0, result = -1;
    for (int i = 0; i < haystack.length(); i++) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        if (j == 0) result = i;
        j++;
        if (j == needle.length()) {
          return result;
        }
      } else {
        if (result != -1) {
          i = result;
        }
        result = -1;
        j = 0;
      }
    }
    return -1;
  }



}
