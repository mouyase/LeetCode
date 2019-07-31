package tech.yojigen.leetcode.Problem0002;

public class Problem {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(5);
//
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(1);

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
        ListNode rootNode = new ListNode(0);
        ListNode tempNode = rootNode;
        boolean nextPlus = false;
        while (true) {
            int temp = 0;
            if (l1 != null) {
                temp = temp + l1.val;
            } else {
                l1 = new ListNode(0);
            }
            if (l2 != null) {
                temp = temp + l2.val;
            } else {
                l2 = new ListNode(0);
            }
            if (nextPlus) {
                temp = temp + 1;
            }
            if (temp >= 10) {
                temp = temp - 10;
                nextPlus = true;
            } else {
                nextPlus = false;
            }
            tempNode.val = temp;
            if (l1.next == null && l2.next == null) {
                if (nextPlus) {
                    tempNode.next = new ListNode(1);
                    tempNode = tempNode.next;
                }
                break;
            }
            tempNode.next = new ListNode(0);
            tempNode = tempNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return rootNode;
    }
}