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
    ListNode* rotateRight(ListNode* head, int k) {
        if(!head||!head->next)return head;
      ListNode*temp=head;
      int len=0;
      while(temp!=NULL){
        temp=temp->next;
        len++;
      }  
      k=k%len;
      if(k==0)return head;
     

ListNode*tail=head;
while(tail->next!=NULL){
    tail=tail->next;
}
ListNode*newTail=head;
for(int i=0;i<len-k-1;i++){
    newTail=newTail->next;
}
tail->next=head;
ListNode*newH=newTail->next;
newTail->next=NULL;
return newH;

        
    }
};