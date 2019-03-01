/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null) {
            // 到达尾部
            if (cur.next == null) {
                return head;
            }

            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
                // 注意这里没有cur = cur.next;，否则就不会比较cur和cur.next.next了
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}