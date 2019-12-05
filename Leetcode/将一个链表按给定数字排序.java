 public static ListNode partition(ListNode head, int x) {
       ListNode nhead1 = new ListNode(0);
       ListNode nhead2 = new ListNode(0);
       ListNode node1 = nhead1;
       ListNode node2 = nhead2;
       while(head != null){
           if(head.val < x){
               node1.next = head;
               head = head.next;
               node1 = node1.next;
               node1.next = null;
           }else{
               node2.next = head;
               head = head.next;
               node2 = node2.next;
               node2.next = null;
           }
       }
       node1.next = nhead2.next;
       return nhead1.next;
   }
   