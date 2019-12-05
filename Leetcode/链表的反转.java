public class Solution {
    public ListNode reverseList(ListNode head) {
        /*ListNode nhead = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = nhead;
            nhead = head;
            head = next;
        }
        return nhead;
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;*/
        ListNode nhead = null;
        ListNode cur = head;
        while(cur != null){
            ListNode pro = cur.next;
            cur.next = nhead;
            nhead = cur;
            cur = pro;
        }
        return nhead;
    }
}