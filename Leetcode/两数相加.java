public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nhead = new ListNode(0);
        ListNode cur = nhead;
        int ten = 0;
        while(l1 != null || l2 != null || ten != 0){
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            int num = l1val + l2val + ten;
            ten = num / 10;

            ListNode node = new ListNode(num % 10);
            cur.next = node;
            cur = cur.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        
        return nhead.next;
    }
