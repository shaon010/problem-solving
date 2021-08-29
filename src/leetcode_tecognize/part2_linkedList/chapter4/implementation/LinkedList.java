package leetcode_tecognize.part2_linkedList.chapter4.implementation;

import java.util.Arrays;

public class LinkedList {
    public Node head;
    public Node tail;

    public class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arrays.stream(new int[]{1, 2, 3, 4}).forEach(linkedList::insert);
        System.out.println(linkedList);
    }
}
