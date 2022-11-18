class Solution {
public:

    ListNode* reverseList(ListNode* &head) {

        if (head == NULL||head->next==NULL)
            return head;

        ListNode* nnode = reverseList(head->next);
        head->next->next = head;
        head->next = NULL;
        return nnode;
    }
};

// same problem on coding ninjas


// #include <bits/stdc++.h> 
// #include <bits/stdc++.h> 
// /****************************************************************

//     Following is the class structure of the LinkedListNode class:

//     template <typename T>
//     class LinkedListNode
//     {
//     public:
//         T data;
//         LinkedListNode<T> *next;
//         LinkedListNode(T data)
//         {
//             this->data = data;
//             this->next = NULL;
//         }
//     };

// *****************************************************************/

// LinkedListNode<int> *reverseLinkedList(LinkedListNode<int> *head) 
// {
//     // Iterative solution this one is good compared to recursive
//     LinkedListNode<int> *prev_n = NULL;
//     LinkedListNode<int> *curr_n = head;
//     LinkedListNode<int> *next_n = head;
    
//     while(curr_n!= NULL){
//         next_n = curr_n -> next;
//         curr_n -> next = prev_n;
//         prev_n = curr_n;
//         curr_n = next_n;
//     }
//     return prev_n;
    
    
//     // recursive solution 
// //     if(head == NULL || head -> next == NULL){
// //         return head;
// //     }
// //     LinkedListNode<int> *head_node = reverseLinkedList(head -> next);
// //     head-> next ->next = head;
// //     head-> next = NULL;
// //     return head_node;
// }
