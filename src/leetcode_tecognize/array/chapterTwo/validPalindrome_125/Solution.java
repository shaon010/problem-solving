package leetcode_tecognize.array.chapterTwo.validPalindrome_125;

/**
 * Accepted 18ms
 */
public class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0; int j = s.length() -1;
        char[] charArray = s.toCharArray();
        while (i < j) {
            if (charArray[i] != charArray[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(new Solution().isPalindrome("race a car")); //false
        System.out.println(new Solution().isPalindrome("madam")); //true
        System.out.println(new Solution().isPalindrome("maam")); //true
    }
}
