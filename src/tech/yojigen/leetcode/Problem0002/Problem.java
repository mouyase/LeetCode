package tech.yojigen.leetcode.Problem0002;

public class Problem {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (true) {
            stringBuilder.append(listNode.val);
            if (listNode.next != null) {
                listNode = listNode.next;
                stringBuilder.append(",");
            } else {
                break;
            }
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0), tempNode = new ListNode(0), templ1 = l1, templ2 = l2;
        while (true) {
            int tempVal = l1.val + l2.val;
            if (tempVal >= 10) {
                tempVal = tempVal - 10;
                tempNode = new ListNode(1);
            }
            listNode.val = tempVal;
            listNode.next = tempNode;
            break;
        }
        return listNode;
    }
}
