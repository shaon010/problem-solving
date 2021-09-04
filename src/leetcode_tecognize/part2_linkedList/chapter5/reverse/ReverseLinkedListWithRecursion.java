package leetcode_tecognize.part2_linkedList.chapter5.reverse;

import leetcode_tecognize.part2_linkedList.chapter4.implementation.LinkedList;

import java.util.Arrays;

//recursive: https://www.geeksforgeeks.org/recursively-reversing-a-linked-list-a-simple-implementation/
public class ReverseLinkedListWithRecursion {
    LinkedList.Node reverse(LinkedList.Node node) {
        if (node.next == null) {
            return node;
        }
        LinkedList.Node newHead = reverse(node.next); // all recursive value will return the last node that we get at last
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList::insert);
        ReverseLinkedListWithRecursion reverse = new ReverseLinkedListWithRecursion();
        LinkedList.Node newHead = reverse.reverse(linkedList.head);
        System.out.println(newHead);
    }
}
