package com.zzs.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(9);

        a.next=b;
        b.next=c;
        c.next=d;

       ListNode result= new ReverseLinkedList().reverseLinkedListNode(a);
        while (result!=null){
            System.out.println(result.value);
            result=result.next;
        }
    }

    public ListNode reverseLinkedListNode(ListNode head){
        ListNode pre=null;
        ListNode next=null;


        while (head!=null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

}
