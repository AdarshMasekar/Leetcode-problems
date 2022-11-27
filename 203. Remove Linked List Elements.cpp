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
    ListNode* removeElements(ListNode* head, int val) {
          if(head==nullptr) return head;
        ListNode *cur_node = head;
          while(head!=nullptr && head->val==val){
            head = head->next;
        }
        while(cur_node && cur_node->next){
            if(cur_node -> next -> val == val)
                cur_node -> next = cur_node -> next -> next;
            else
                cur_node = cur_node -> next;
        }
       
        return head;
     
    }
};
