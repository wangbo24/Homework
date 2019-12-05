public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n = headA;
        ListNode m = headB;
        while(n.next != null){
            m = headB;
            while(m.next != null){
                if(n.next == m.next){
                    n.next.next = null;
                    return n.next;
                }
                m = m.next;
            }
            n = n.next;
        }
        return null;
    }
  