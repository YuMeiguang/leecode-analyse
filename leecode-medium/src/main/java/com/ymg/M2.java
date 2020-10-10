package com.ymg;

/**
 * @author yumg
 * @create 2020/10/09
 * @desc
 * @since 1.0.0
 **/
public class M2 {

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode root = new ListNode();
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val+l2Val+carry;
            carry = sumVal/10;
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode listNode2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        System.out.printf(addTwoNumbers(listNode1,listNode2)+"");
    }

}

class ListNode{
    int val;
    ListNode next;
    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListNode{");
        sb.append("val=").append(val);
        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }
}
