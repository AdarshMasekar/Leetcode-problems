/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
    
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        // best solution with O(n/2) complexity
        ListNode *slow = head, *fast = head;
        while (fast && fast->next)
            slow = slow->next, fast = fast->next->next;
        return slow;
        
        // naive approach
//         int count=0;
//         ListNode *temp=head;
//         while(temp){
//             count++;
//             temp = temp->next;
//     }
//         temp=head;
//         for(int i=;i<n/2;i++)
//             temp = temp -> next;
//         return temp;
};
    
