package com.ymg;

/**
 * @author yumg
 * @create 2019/08/15
 * @desc Leetcode 21
 * @since 1.0.0
 **/
public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
         ListNode listNode = mergeTwoList(l1,l2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoList(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2!= null){
            if (l1.val<l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }else{
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }

        if (null == l1){
            cur.next = l2;
        }

        if (null == l2){
            cur.next = l1;
        }

        return dummyHead.next;
    }

    static class ListNode{
        private Integer val;
        private ListNode pre;
        private ListNode next;

        public ListNode(Integer val) {
            this.val = val;
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        public ListNode getPre() {
            return pre;
        }

        public void setPre(ListNode pre) {
            this.pre = pre;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }



}
