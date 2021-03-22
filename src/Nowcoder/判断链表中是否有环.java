package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-03-22 20:36
 **/
//判断给定的链表中是否有环。如果有环则返回true，否则返回false。
public class 判断链表中是否有环 {
    //快慢指针，如果相遇，代表有环
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
