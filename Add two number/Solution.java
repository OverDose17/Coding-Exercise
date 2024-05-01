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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        
        int temp = 0;
        for( ; l1 != null || l2 != null || temp == 1;) {
                int number = 0;
            if(l1 != null) {
                number += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                number += l2.val;
                l2 = l2.next;
            }
            number = number + temp;
            temp = number / 10;
            ListNode node = new ListNode(number % 10);
            ptr.next = node;
            ptr = ptr.next;
        }
        return result.next;
    }
}