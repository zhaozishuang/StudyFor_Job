package com.zzs.linkedlist;

public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode a=new ListNode(2);
        ListNode b=new ListNode(5);
       ListNode c=new ListNode(8);
        l1.next=a;
        a.next=b;
        b.next=c;

        ListNode l2=new ListNode(0);
        ListNode d=new ListNode(1);
        ListNode e=new ListNode(7);
        ListNode f=new ListNode(10);
       l2.next=d;
       d.next=e;
       e.next=f;
       ListNode res=new MergeLinkedList().mergeLinkedList(l1,l2);
        while(res!=null){
            System.out.println(res.value);
            res=res.next;
        }
    }

    public ListNode mergeLinkedList(ListNode l1,ListNode l2){
        if (l1 ==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1.value<l2.value){
            l1.next=mergeLinkedList(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeLinkedList(l1,l2.next);
            return l2;
        }

    }
}
