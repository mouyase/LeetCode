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
        ListNode listNode;
        ListNode tl1 = l1, tl2 = l2;
        while (true) {
            int tmpData;
            tmpData = tl1.val + tl2.val;
            if (tmpData >= 10) {
                listNode = new ListNode(tmpData - 10);
            } else {
                listNode = new ListNode(tmpData);
            }
            if (tl1.next != null && tl2.next != null) {
                tl1 = tl1.next;
                tl2 = tl2.next;
            }
            if (tl1.next == null && tl2.next == null) {
                break;
            }
        }
        return listNode;
    }
}
