/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp3=new ListNode(0);
        ListNode t=temp3;
        
        int carry=0;
        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val+carry;
            int r=sum%10;
            carry=sum/10;

            ListNode l3=new ListNode(r);
            t.next=l3;
            t=t.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }

        while(temp1!=null){
            int sum=temp1.val+carry;
                int r=sum%10;
                carry=sum/10;
            
            ListNode l3=new ListNode(r);
            t.next=l3;
            t=t.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int sum=temp2.val+carry;
                int r=sum%10;
                carry=sum/10;

            ListNode l3=new ListNode(r);
            t.next=l3;
            t=t.next;
            temp2=temp2.next;
        }
        if(carry>0){
            ListNode l3=new ListNode(carry);
            t.next=l3;
        }

        ListNode result=temp3.next;
        temp3.next=null;

        return result;
    }
}
