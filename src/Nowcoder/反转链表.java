package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-03-15 20:21
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class 反转链表 {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
}
