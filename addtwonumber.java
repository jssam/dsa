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
        ListNode nd= new ListNode(-1);
        ListNode ref = nd;
        int carr = 0;
        while(l1!=null&&l2!=null){
            int val = (l1.val+l2.val+carr)%10;
            carr = (l1.val+l2.val+carr)/10;
            ListNode  a = new ListNode(val);
            nd.next =a;
            nd = nd.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
             int val = (l1.val+carr)%10;
            carr = (l1.val+carr)/10;
            ListNode  a = new ListNode(val);
            nd.next =a;
            nd = nd.next;
            l1 = l1.next;
        }
         while(l2!=null){
             int val = (l2.val+carr)%10;
            carr = (l2.val+carr)/10;
            ListNode  a = new ListNode(val);
            nd.next =a;
            nd = nd.next;
            l2 = l2.next;

        }
        if(carr!=0){
             ListNode  a = new ListNode(carr);
            nd.next =a;
            nd = nd.next;
        }
        return ref.next;
        
    }
}
