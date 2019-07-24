package com.zzs.linkedlist;

public class CountDownK {

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

        ListNode result=new CountDownK().downK(a,3);
        System.out.println(result.value);

    }


    public ListNode downK(ListNode head,int k){
        if (head==null || k<=0) return null;

        int count=0;
        int index=k;
        ListNode l1=head,l2=head;
        while (l1!=null){
            l1=l1.next;
            count++;
            if (k<1){
                l2=l2.next;
            }
            k--;
        }
        if (count<index) return null;
        return l2;
    }


}
