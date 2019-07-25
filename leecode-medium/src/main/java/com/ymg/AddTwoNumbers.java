package com.ymg;

/**
 * @author yumg
 * @create 2019/07/25
 * @desc leecode 2
 * @since 1.0.0
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 **/
public class AddTwoNumbers {
    static class ListNode{
        String value;
        ListNode next;
        ListNode pre;

        public ListNode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public ListNode setNext(ListNode next) {
            this.next = next;
            return next;
        }

        public ListNode getPre() {
            return pre;
        }

        public void setPre(ListNode pre) {
            this.pre = pre;
        }
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode("2");
        ListNode listNode11 = new ListNode("4");
        ListNode listNode12 = new ListNode("3");
        listNode1.setNext(listNode11).setNext(listNode12);

        ListNode listNode2 = new ListNode("5");
        ListNode listNode21 = new ListNode("6");
        ListNode listNode22 = new ListNode("4");
        listNode2.setNext(listNode21).setNext(listNode22);
        ListNode resultListNode = addTwoNumbers(listNode1,listNode2);
        System.out.println(resultListNode.getValue());
        System.out.println(resultListNode.getNext().getValue());
        System.out.println(resultListNode.getNext().getNext().getValue());

    }

    public static ListNode addTwoNumbers(ListNode listNode1,ListNode listNode2){
        int sum = 0;
        int flag = 0;
        ListNode sentinel = new ListNode(null);
        ListNode resultNode = sentinel;
        while (listNode1!=null || listNode2!=null){
            if (listNode1 != null){
                sum = sum + Integer.valueOf(listNode1.getValue());
                listNode1 = listNode1.getNext();
            }

            if (listNode2 != null){
                sum = sum + Integer.valueOf(listNode2.getValue());
                listNode2 = listNode2.getNext();
            }
            sum = sum + flag;
            flag = sum/10;
            resultNode.next = new ListNode(String.valueOf(sum%10));
            resultNode = resultNode.next;
            sum = 0;

        }

        return sentinel.next;
    }

}
