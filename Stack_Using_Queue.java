import java.util.LinkedList;

import java.util.Queue;

 

public class Solution{

    static class Stack {

        // Define the data members.

    Queue<Integer> q=new LinkedList<>();

        public Stack() {

            // Implement the Constructor.

        }

 

        /*----------------- Public Functions of Stack -----------------*/

 

        public int getSize() {

            // Implement the getSize() function.

            return q.size();

        }

 

        public boolean isEmpty() {

            // Implement the isEmpty() function.

            return q.isEmpty();

        }

 

        public void push(int x) {

            // Implement the push(element) function.

            q.add(x);

            for(int i=0;i<q.size()-1;i++){

                q.add(q.remove());

            }

        }

 

        public int pop() {

            if(q.isEmpty()){

                return -1;

            }

            // Implement the pop() function.

            return q.remove();

        }

 

        public int top() {

            if(q.isEmpty()){

                return -1;

        }

            // Implement the top() function.

            return q.peek();

        }

    }

}
