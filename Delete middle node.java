// problem link : https://www.codingninjas.com/studio/problems/delete-middle-node_763267
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
 };

 *****************************************************************/

public class Solution {
    public static Node deleteMiddle(Node head) {
        if(head.next == null){
            return new Node(-1);
        }
        // Write your code here.
        Node temp = head;
        int len = 1;
        while(temp.next != null){
            temp= temp.next;
            len++;
        }

        Node temp2 = head;
        int half=len/2-1;
        
        while(half > 0){
            temp2 = temp2.next;
half--;        }
        temp2.next = temp2.next.next;
        return head;
    }
}