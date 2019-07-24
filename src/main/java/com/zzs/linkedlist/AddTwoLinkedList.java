package com.zzs.linkedlist;


public class AddTwoLinkedList {
    public static void main(String[] args) {
        ListNode01 l1=new ListNode01(5);
        l1.next=new ListNode01(6);
        l1.next.next=new ListNode01(1);

        ListNode01 l2=new ListNode01(4);
        l2.next=new ListNode01(1);
        l2.next.next=new ListNode01(9);

        ListNode01 listnode=new AddTwoLinkedList().addTwoLinkedList(l1,l2);
        while(listnode!=null){
            System.out.println(listnode.value);
            listnode=listnode.next;
        }

    }

    public ListNode01 addTwoLinkedList(ListNode01 l1,ListNode01 l2){
        ListNode01 dummyHead=new ListNode01(0);
        ListNode01 p=l1,q=l2,curr=dummyHead;
        int carry=0;

        while (p!=null || q!=null){
            int x= (p!=null) ? p.value:0;
            int y= (q!=null) ? q.value:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode01(sum%10);
            curr=curr.next;

            if (p!=null) p=p.next;
            if (q!=null) q=q.next;
        }
        if (carry>0){
            curr.next=new ListNode01(carry);
        }
        return dummyHead.next;

    }


}
