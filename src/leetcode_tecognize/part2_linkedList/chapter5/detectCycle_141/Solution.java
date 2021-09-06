package leetcode_tecognize.part2_linkedList.chapter5.detectCycle_141;

import leetcode_tecognize.part2_linkedList.chapter4.implementation.LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Learning: Set is much faster -> contains, add , remove O(1) than arrayList
 * Check null and empty for leetcode solution
 */
public class Solution {
    private Set<LinkedList.Node> traverseList = new HashSet<>();
    public boolean hasCycle(LinkedList.Node head) {
        boolean hasCycle = false;
        while (head != null && head.next != null) {
            if (traverseList.contains(head.next)) {
                hasCycle = true;
                break;
            } else {
                head = head.next;
                traverseList.add(head);
            }
        }
        return hasCycle;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList::insert);
        linkedList.tail.next = linkedList.head;
        System.out.println(new Solution().hasCycle(linkedList.head));
    }
}
