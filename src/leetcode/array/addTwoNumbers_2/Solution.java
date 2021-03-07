package leetcode.array.addTwoNumbers_2;

/***
 * Accepted Solution
 * Runtime: 2 ms, faster than 84.36% of Java online submissions
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    ListNode resultNode;
    ListNode currentNode;
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        carry = 0;
        if (val > 9) {
            carry = val/10;
            val = val%10;
        }
        if (resultNode == null) {
            currentNode = new ListNode(val);
            resultNode = currentNode;
        } else {
            currentNode.next = new ListNode(val);
            currentNode = currentNode.next;
        }
        if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
            addTwoNumbers( (l1 != null ? l1.next : null), (l2 != null ? l2.next : null));
        } else if (carry != 0) {
            currentNode.next = new ListNode(carry);
            currentNode = currentNode.next;
        }
        return resultNode;
    }

    public static void main(String[] args) {
        ListNode testNode = new ListNode(5);

        ListNode anotherTestNode = new ListNode(5);
        anotherTestNode.next = new ListNode(8);

        new Solution().addTwoNumbers(testNode, anotherTestNode);
    }
}