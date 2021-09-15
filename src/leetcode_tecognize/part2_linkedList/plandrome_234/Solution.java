package leetcode_tecognize.part2_linkedList.plandrome_234;

import leetcode_tecognize.part2_linkedList.chapter4.implementation.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This solution took a lot of times, lot of retires.
 * I am worried.
 *
 * Learning: Should think with more test cases and more carefully
 */
public class Solution {
    int size = 0;
    int mid = 0;
    boolean odd = true;
    List<Integer> firstHalfValueList = new ArrayList<>();
    public boolean isPalindrome(LinkedList.Node head) {
        int start = 1;
        boolean firstCheck = true;
        int arrayLength = 0;
        size = getSize(head);
        if (size == 1) {
            return true;
        }
        while (head != null) {
            if (start < mid) {
                firstHalfValueList.add(head.value);
                head = head.next;
                start++;
                arrayLength++;
            } else {
                head = firstCheck && odd ? head.next : head;
                if (head != null && firstHalfValueList.get(arrayLength - 1) != head.value) {
                    return false;
                }
                arrayLength--;
                firstCheck = false;
                head = head.next;
            }
        }
        return true;
    }

    private int getSize(LinkedList.Node head) {
        while (head != null) {
            size++;
            head = head.next;
        }
        mid = 1 + size / 2;
        if (size % 2 == 0) {
            odd = false;
        }
        return size;
    }

    /**
     * Time limit error
     */
    public boolean isPalindromeTimeLimitError(LinkedList.Node head) {
        String valueString = "";
        String reversedString = "";
        while (head != null) {
            valueString += String.valueOf(head.value);
            reversedString = head.value + reversedString;
            head = head.next;
        }
        if (valueString.length() > 0 && valueString.equals(reversedString)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 2, 1}).forEach(linkedList::insert);
        System.out.println(new Solution().isPalindrome(linkedList.head));

        LinkedList linkedList2 = new LinkedList();
        Arrays.stream(new int[]{1, 2}).forEach(linkedList2::insert);
        System.out.println(new Solution().isPalindrome(linkedList2.head));

        LinkedList linkedList3 = new LinkedList();
        Arrays.stream(new int[]{1}).forEach(linkedList3::insert);
        System.out.println(new Solution().isPalindrome(linkedList3.head));

        LinkedList linkedList4 = new LinkedList();
        Arrays.stream(new int[]{1, 0, 0}).forEach(linkedList4::insert);
        System.out.println(new Solution().isPalindrome(linkedList4.head));
    }
}
