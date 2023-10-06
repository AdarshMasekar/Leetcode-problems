// problem link : https://www.codingninjas.com/studio/problems/cycle-detection-in-a-singly-linked-list_628974

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here//Your code goes here        

        Node fast = head.next;        

        Node slow = head;        

        while( slow!= fast) {            

            if (fast == null || fast.next == null) {            

                return false;            

            }            

            fast=fast.next.next;

            slow=slow.next;

        }

        return true;
    }
}
