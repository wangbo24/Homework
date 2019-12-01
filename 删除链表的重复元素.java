public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        /*if(head==null){
            return null;
        }
        ListNode nhead = new ListNode(-1);
        ListNode quite = head.next;
        ListNode low = head;
        ListNode cur = nhead;
        当两个不相等，
        两个就往后一起走，
        挡块的和慢的相等，快的再往后走并删除相等的，
        while(quite!=null){
            if(quite.val==low.val){
                low = quite;
                quite = quite.next;
            }else{
                quite = quite.next;
                cur.next = low;
                cur = cur.next;
                low = low.next;
            }
        }
        return nhead.next;*/
        if(head == null || head.next == null){
            return head;
        }
        if(head.val == head.next.val){
            head = deleteDuplicates(head.next);
        }else{
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}