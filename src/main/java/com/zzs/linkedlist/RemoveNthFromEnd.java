package com.zzs.linkedlist;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        ListNode result=new RemoveNthFromEnd().removeNthFromEnd(a,6);
        while (result!=null){
            System.out.println(result.value);
            result=result.next;
        }
    }

    private ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode l1=dummyHead,l2=dummyHead;

        while (l1!=null){
            l1=l1.next;

            if (k<1 && l1!=null){
                l2=l2.next;
            }
            k--;
        }
        l2.next=l2.next.next;
        return dummyHead.next;

    }


}
