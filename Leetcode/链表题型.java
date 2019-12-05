
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode nhead = null;
        int length=1;
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
            length++;
        }

        k = k%length;
        if(k == 0){
            return head;
        }else{
            cur.next = head;
            cur = head;
            for(int i=0;i<length-k-1;i++){
                cur  = cur.next;
                nhead = cur.next;
            }
            cur.next = null;

        }
        return nhead;
    }
    //public static boolean isPalindrome(ListNode head) {
        ListNode nhead = null;
        ListNode cur = head;
        while(cur != null){
            ListNode pro = cur.next;
            cur.next = nhead;
            nhead = cur;
            cur = pro;
        }
        printLinkedList(nhead);
        System.out.println("--------------------");
        printLinkedList(head);

        while(head != null && nhead != null){
            if(head.val != nhead.val){
                return false;
            }
            head = head.next;
            nhead = nhead.next;
        }
        return true;
    }