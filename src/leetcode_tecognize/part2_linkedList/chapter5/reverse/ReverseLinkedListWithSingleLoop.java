package leetcode_tecognize.part2_linkedList.chapter5.reverse;

import leetcode_tecognize.part2_linkedList.chapter4.implementation.LinkedList;

import java.util.Arrays;

//without recursion, with a loop only: https://www.geeksforgeeks.org/reverse-a-linked-list/
public class ReverseLinkedListWithSingleLoop {
    /**
     * lastNext = null
     * lastPrev = null
     * currentNode = [1]
     *
     * Loop: 1
     * [1]->[2]->[3]->[4]
     * lastNext = currentNode.next[2]
     * currentNode.next ([1].next) = lastPrev (null)
     * lastPrev = [1]
     * currentNode = [2]
     * [1] -> null...
     *
     * Loop: 2
     * lastNext = currentNode.next[3]
     * currentNode.next ([2].next) = lastPrev (1)
     * lastPrev = [2]
     * currentNode = [3]
     * [2]->[1]...
     *
     * Loop: 3
     * lastNext = currentNode.next[4]
     * currentNode.next ([3].next) = lastPrev (2)
     * lastPrev = [3]
     * currentNode = [4]
     * [3]->[2]->[1]...
     *
     * Loop: 4
     * lastNext = currentNode.next[null]
     * currentNode.next ([4].next) = lastPrev (3)
     * lastPrev = [4]
     * currentNode = [null] End while condition
     * [4]->[3]->[2]->[1]
     *
     * REVERSED
     */
    LinkedList.Node reverse(LinkedList.Node node) {
        LinkedList.Node lastNext;
        LinkedList.Node lastPrev = null;
        LinkedList.Node currentNode = node;
        while (currentNode != null) {
            lastNext = currentNode.next;
            currentNode.next = lastPrev;
            lastPrev = currentNode;
            currentNode = lastNext;
        }
        return lastPrev;
    }

    /**
     * Leetcode - 206
     */
    /*public ListNode reverseList(ListNode head) {
        ListNode lastNext;
        ListNode lastPrev = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            lastNext = currentNode.next;
            currentNode.next = lastPrev;
            lastPrev = currentNode;
            currentNode = lastNext;
        }
        return lastPrev;
    }*/

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList::insert);
        ReverseLinkedListWithSingleLoop reverse = new ReverseLinkedListWithSingleLoop();
        LinkedList.Node newHead = reverse.reverse(linkedList.head);
        System.out.println(newHead);
    }
}
