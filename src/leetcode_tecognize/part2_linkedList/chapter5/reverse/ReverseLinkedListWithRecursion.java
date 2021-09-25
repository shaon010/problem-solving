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

    //I got the idea of preNode/nextNode from reverse with single loop.
    private LinkedList.Node prevNode = null;

    LinkedList.Node reverseWithRecursionAnotherWay(LinkedList.Node node) {
        LinkedList.Node nextNode = node.next;
        node.next = prevNode;
        if (nextNode == null) {
            return node;
        }
        prevNode = node;
        return reverseWithRecursionAnotherWay(nextNode);
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList::insert);
        ReverseLinkedListWithRecursion reverse = new ReverseLinkedListWithRecursion();
        LinkedList.Node newHead = reverse.reverse(linkedList.head);
        System.out.println(newHead);

        LinkedList linkedList2 = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList2::insert);
        LinkedList.Node newHead2 = reverse.reverseWithRecursionAnotherWay(linkedList2.head);
        System.out.println(newHead2);
    }
}
