import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public static ListNode partition(ListNode phead, int x) {
        // write code here
        ListNode sm = new ListNode(0);
        ListNode per = sm;
        ListNode big = new ListNode(0);
        ListNode pro = big;
        while(phead != null){
            if(phead.val < x){
                per.next = phead;
                per = per.next;
            }else{
                pro.next = phead;
                pro = pro.next;
            }
            phead = phead.next;
        }
        pro.next = null;
        per.next = big.next;
        return sm.next;
    }
    
}