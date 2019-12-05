//判断是否是回文链表
    public static boolean isPalindrome1(ListNode head) {
        if(head == null || head.next == null ){
            return true;
        }
        ListNode prev = null;
        ListNode cur = head;
        int length = 0;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        int num = length/2;
        cur = head.next;
        for(int i = 0;i < num;i++){
            head.next = prev;
            prev = head;
            head = cur;
            cur = cur.next;
        }
        if(length%2 == 0){
            while(prev != null || head !=null){
                if(prev.val != head.val){
                    return false;
                }else{
                    prev =prev.next;
                    head = head.next;
                }
            }
        }else{
            while(prev != null || cur !=null){
                if(prev.val != cur.val){
                    return false;
                }else{
                    prev = prev.next;
                    cur = cur.next;
                }
            }
        }

        return true;
    }
