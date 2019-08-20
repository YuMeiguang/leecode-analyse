package com.ymg;

/**
 * @author yumg
 * @create 2019/08/08
 * @desc  Leetcode 19
 * @since 1.0.0
 **/
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        ListNode aa = list;
        while (aa != null){
            System.out.printf(aa.getValue()+"->");
            aa = aa.next;
        }
        System.out.println();
        ListNode listNode = removeNthFromEnd(list,2);
        while (listNode != null){
            System.out.printf(listNode.getValue()+"->");
            listNode = listNode.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start,fast = start;
        slow.next = head;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    static class ListNode {
        Integer value;
        ListNode next;
        ListNode pre;

        public ListNode(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public ListNode getNext() {
            return this.next;
        }

        public ListNode setNext(ListNode next) {
            this.next = next;
            return next;
        }

        public ListNode getPre() {
            return this.pre;
        }

        public void setPre(ListNode pre) {
            this.pre = pre;
        }
    }
}
