package day;//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
// Related Topics 链表 
// 👍 751 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class day4_n24_两两交唤 {

    public static void main(String[] args) {
        // {1,2,3,4,5} -> {2,1,4,3,5}
        // {} -> {}
        // {2,1,4,3} -> {1,2,3,4}

        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(4,ln5);
        ListNode ln3 = new ListNode(3,ln4);
        ListNode ln2 = new ListNode(2,ln3);
        ListNode ln1 = new ListNode(1,ln2);

        // 输出结果
        System.out.println(swapPairs(ln1).toString());

    }

    // 两两交换函数
    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        int val = head.val;        // ①
        ListNode next = head.next; // ②
        ListNode Three = head.next.next;// ③

        head.val = next.val;
        next.val = val;
        swapPairs(Three);
        return head;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
