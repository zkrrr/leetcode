package zk.questionTwo;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author zhukangrong
 * @date 2019-10-14
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
}
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        int x = l1.val;
        int y = l2.val;
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while (true){
            sum = x + y + carry;
            listNode.val = sum % 10;
            carry = sum / 10;
            if (null == l1){
                x = 0;
            }else {
                l1 = l1.next;
                x = l1 != null ? l1.val : 0;
            }
            if (null == l2){
                y = 0;
            }else {
                l2 = l2.next;
                y = l2 != null ? l2.val : 0;
            }
            if (null == l1 && null == l2){
                if (0 != carry){
                    listNode.next = new ListNode(carry);
                }
                break;
            }
            listNode.next = new ListNode(0);
            listNode = listNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode x = new ListNode(5);
        ListNode y = new ListNode(5);
        ListNode result = new AddTwoNumber().addTwoNumbers(x, y);
        while (null != result){
            System.out.print(result.val + "\t");
            result = result.next;
        }
    }
}
