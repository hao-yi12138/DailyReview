package Nowcoder;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-03-22 21:12
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/b49c3dc907814e9bbfa8437c251b028e?orderByHotValue=1&questionTypes=000100&mutiTagIds=580&page=1&onlyReference=false
 * 来源：牛客网
 *
 * 将给出的链表中的节点每 k个一组翻转，返回翻转后的链表
 * 如果链表中的节点数不是k的倍数，将最后剩下的节点保持原样
 * 你不能更改节点中的值，只能更改节点本身。
 * 要求空间复杂度  O(1)
 * 例如：
 * 给定的链表是、 1→2→3→4→5
 * 对于  k=2, 你应该返回 2→1→4→3→5
 * 对于  k=3, 你应该返回 3→2→1→4→5
 */
public class 链表中的节点每k个一组翻转 {
    //头插法
    public ListNode reverseKGroup (ListNode head, int k) {
        if(head == null || head.next == null || k < 2) return head;
        ListNode node = new ListNode(0);
           node.next = head;
        ListNode prev = node,cur = head;
         int len = 0;
         while(head != null){
             len++;
             head = head.next;
         }
        for (int i = 0; i < len/k ; i++) {
            for (int j = 1; j < k; j++) {
                ListNode curNext = cur.next;
                cur.next = curNext.next;
                curNext.next = prev.next;
                prev.next = curNext;
            }
            prev = cur;
            cur = cur.next;
        }
        return node.next;
    }
}
