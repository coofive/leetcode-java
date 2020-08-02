package base;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-07-11 06:03
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
