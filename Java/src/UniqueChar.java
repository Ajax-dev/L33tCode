/**
 * Problem number 387, first unique character in a string
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *      Constraints:
 *          1 <= s.length <= 105
 *          s consists of only lowercase English letters.
 *
 * Runtime: 25 ms, faster than 48.50% of Java online submissions for First Unique Character in a String.
 * Memory Usage: 47.8 MB, less than 37.39% of Java online submissions for First Unique Character in a String.
 */

public class UniqueChar {
    public int firstUniqChar(String s) {
        int indexOfUn = -1;

        for (int i = 0; i < s.length(); i++) {
            int firstInd = s.indexOf(s.charAt(i));
            int lastInd = s.lastIndexOf(s.charAt(i));

            if (firstInd == lastInd) {
                indexOfUn = firstInd;
                return indexOfUn;
            }

        }

        return indexOfUn;
    }
}
