package main.java.lc.normal.listnode;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {


    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(l1.val+ l2.val);
        while(l1.next!=null && l2.next!=null){
            ListNode list = new ListNode((l1.next!=null? l1.next.val: 0) + (l2.next!=null? l2.next.val: 0));
            l1 = l1.next;
            l2 = l2.next;
            temp.next = list;
        }

        ListNode l3 = null;
        while(temp!=null){
            if(temp.val>=10){
                temp.next.val = temp.next.val+1;
                temp.val = temp.val-10;
            }
            if(l3==null){
                l3 = new ListNode(temp.val);
            }else{

            }


        }
        return l3;
    }

    private boolean plusOne(int val){
        if(val>=10) return true;
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
