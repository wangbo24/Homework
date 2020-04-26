public class Main {
    public ListNode plusAB(ListNode l1, ListNode l2) {
        // write code here
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int ten = 0;
        int n ;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null || l2 != null || ten != 0){
            int aval = l1 != null ? l1.val : 0;
            int bval = l2 != null ? l2.val : 0;
            n = aval + bval + ten;
            if(n >= 10){
                n = n%10;
                ten = n/10;
            }
            ListNode node = new ListNode(n);
            cur.next = node;
            cur = cur.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return head.next;
    }
}