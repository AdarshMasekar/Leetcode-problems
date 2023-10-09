import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!

		Stack<Integer> stack=new Stack<>();

		LinkedListNode<Integer> temp=head;
		
		while(temp!=null){
			stack.push(temp.data);
			temp=temp.next;
		}

		while(head!=null){
			if(!head.data.equals(stack.pop()))
			{
				return false;
			}
			head=head.next;
			
		}
		return true;
		
	}
}
