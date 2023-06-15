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

    public int getDecimalValue(ListNode head) {
        
        
        int len = -1;
        int ans = 0,power = 1;
        ListNode dummy = head;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }

        while(dummy != null){
            power =(int) Math.pow(2,len);
            ans += dummy.val * power;
            len --;
            dummy = dummy.next;
        }

        return ans;
       
    }
}
