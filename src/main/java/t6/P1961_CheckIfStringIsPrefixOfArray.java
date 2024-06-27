package t6;

public class P1961_CheckIfStringIsPrefixOfArray {
    /*
    Given a string s and an array of strings words, determine whether s is a prefix string of words.

    A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

    Return true if s is a prefix string of words, or false otherwise.
    Example 1:

    Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
    Output: true
    Explanation:
    s can be made by concatenating "i", "love", and "leetcode" together.
    Example 2:

    Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
    Output: false
    Explanation:
    It is impossible to make s using a prefix of arr.
    */


    /*
        1 ideal khác có thể nói đến:
            - iterate all of arrays
                ->if prefix not starts with element -> return false: vd: s = youLoveLeetcode , words = i, love, leetcode ; you != i
                ->duyệt tiếp bằng cách loại bỏ đối tượng -> dùng substring
    */

    public static boolean solution(String prefix, String[] words) {
        for (int i = 0; i < words.length ; i++) {
            String word = words[i];
            if (!prefix.startsWith(word)) {

                if (prefix.length() == 0) break;

                return false;
            }

            prefix = prefix.substring(word.length());
        }
        return prefix.length() == 0;
    }

    /*
        build 1 substring
    */

    public static boolean isPrefixString(String s, String[] words) {
        String sub = "";
//        if (!s.substring(0, sub.length()).equals(sub)) {
//            return false;
//        }

        for (int i = 0; i < words.length; i++) {
            sub += words[i];

            if (sub.equals(s)) {
                return true;
            }

            if (!s.contains(sub)) {
                sub = sub.replace(words[i], "");
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("iloveleetcode", new String[] {"i","love","leetcode","apples"}));
    }
}
