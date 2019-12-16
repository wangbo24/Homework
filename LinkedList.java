class ListNode{
    int val;
    ListNode next;
    public ListNode(){
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    public void methodB(){

    }
    @Override
    public String toString() {
        return String.format("ListNode{%d}",val);
    }
}
public class Solution {
    public static ListNode copy(ListNode head){
        ListNode nhead = new ListNode();
        ListNode cur = null;
        while(head != null) {
            if (cur == null) {
                nhead = head;
            } else {
                cur.next = head;
            }
            cur = head;
            head = head.next;
        }
        return nhead;
    }



    public static void main(String[] args) {
        ListNode n4 = new ListNode(4,null);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        System.out.println(copy(n1));
    }
}
