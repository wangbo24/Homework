public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here

        ListNode nhead = null;
        ListNode cur = null;
        int s = 0,x = 0;
        while(a != null && b != null){
            int num = a.val + b.val;
            num = num+s;
            s = 0;
            if(num >= 10){
                s = num/10;
                x = num%10;
            }else{
                x = num;
            }
            ListNode pro = new ListNode(x);
            if(nhead == null){
                nhead = pro;
            }else{
                cur.next = pro;
            }
            cur = pro;
            a = a.next;
            b = b.next;
        }

        if(b == null){
            while(a!=null){
                    ListNode node = new ListNode(s + a.val);
                    cur.next = node;
                    cur = node;
                    a = a.next;
                    s = 0;
            }
        }
        if(a == null){
            while(b!=null){
                    ListNode node = new ListNode(s + b.val);
                    cur.next = node;
                    cur = node;
                    b = b.next;
                    s = 0;
            }
        }
        if(s != 0){
            ListNode node = new ListNode(s);
            cur.next = node;
            cur = node;
        }
        return nhead;
    }
  
}