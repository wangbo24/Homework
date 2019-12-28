public class Main {
    static class ListNode{
        int val;
        ListNode next;

        public  ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode m1 = new ListNode(2);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(4);
        ListNode m4 = new ListNode(8);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
       // rest(n1,m1);
        //System.out.println(rest(n1,m1));
        ListNode head = rest(n1,m1);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode rest(ListNode s, ListNode t){
        ListNode curs = s;
        ListNode curt = t;
        ListNode nhead = new ListNode(0);
        ListNode cur = nhead;
        while(curs != null && curt != null){
            if(curs.val > curt.val){

                cur.next = curt;
                curt = curt.next;
            }else if(curs.val < curt.val){
                cur.next = curs;
                curs = curs.next;
            }else {
                curt = curt.next;
                cur.next = curs;
                curs = curs.next;
            }
            cur = cur.next;
        }
        if(curs == null){
            cur.next = curt;
        }
        if(curt == null){
            cur.next = curs;
        }
        return nhead.next;
    }
}
