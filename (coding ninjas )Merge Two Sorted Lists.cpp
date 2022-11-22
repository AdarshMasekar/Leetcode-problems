#include <bits/stdc++.h> 
#include <bits/stdc++.h> 
/************************************************************

    Following is the linked list node structure.
    
    template <typename T>
    class Node {
        public:
        T data;
        Node* next;

        Node(T data) {
            next = NULL;
            this->data = data;
        }

        ~Node() {
            if (next != NULL) {
                delete next;
            }
        }
    };

************************************************************/

Node<int>* sortTwoLists(Node<int>* list1, Node<int>* list2)
{
   // Write your code here.
 if(list1 == NULL) return list2;
 if(list2 == NULL) return list1;
       if(list1->data <= list2->data) {
           list1->next = sortTwoLists(list1->next, list2);
           return list1;
       }
       else {
           list2->next = sortTwoLists(list1, list2->next);
           return list2;
       }
   
}
