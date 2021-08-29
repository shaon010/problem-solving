package leetcode_tecognize.part2_linkedList.chapter5.reverse;

import leetcode_tecognize.part2_linkedList.chapter4.implementation.LinkedList;

import java.util.Arrays;

//todo implement
//recursive: https://www.geeksforgeeks.org/recursively-reversing-a-linked-list-a-simple-implementation/
//without recursion, with a loop only: https://www.geeksforgeeks.org/reverse-a-linked-list/
public class ReverseLinkedListWithRecursion {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList::insert);
        ReverseLinkedListWithRecursion reverse = new ReverseLinkedListWithRecursion();
        //reverse.reverse(linkedList.head);
        System.out.println(linkedList);
    }
}
