package com.ymg;

/**
 * @author yumg
 * @create 2019/07/26
 * @desc Leetcode 3
 * @since 1.0.0
 **/
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(Integer.valueOf(2));
        ListNode listNode11 = new ListNode(Integer.valueOf(4));
        ListNode listNode12 = new ListNode(Integer.valueOf(3));
        listNode1.setNext(listNode11).setNext(listNode12);
        ListNode listNode2 = new ListNode(Integer.valueOf(5));
        ListNode listNode21 = new ListNode(Integer.valueOf(6));
        ListNode listNode22 = new ListNode(Integer.valueOf(4));
        listNode2.setNext(listNode21).setNext(listNode22);
        ListNode resultListNode = addTwoNumbers(listNode1, listNode2);
        System.out.println(resultListNode.getValue());
        System.out.println(resultListNode.getNext().getValue());
        System.out.println(resultListNode.getNext().getNext().getValue());
    }

    public static ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        int sum = 0;
        int flag = 0;
        ListNode sentinel = new ListNode((Integer)null);

        for(ListNode resultNode = sentinel; listNode1 != null || listNode2 != null; sum = 0) {
            if(listNode1 != null) {
                sum += listNode1.getValue().intValue();
                listNode1 = listNode1.getNext();
            }

            if(listNode2 != null) {
                sum += listNode2.getValue().intValue();
                listNode2 = listNode2.getNext();
            }

            sum += flag;
            flag = sum / 10;
            resultNode.next = new ListNode(Integer.valueOf(sum % 10));
            resultNode = resultNode.next;
        }

        return sentinel.next;
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
