package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-07-11 06:51
 */
public class ListNodeHelper {

    public static ListNode generateListNode(int[] arr) {
        ListNode node = null;
        ListNode temp = null;
        ListNode curr = null;
        for (int value : arr) {
            curr = new ListNode(value);
            if (node == null) {
                node = curr;
                temp = curr;
            } else {
                temp.next = curr;
                temp = temp.next;
            }
        }
        return node;
    }

    public static ListNode generateCycleListNode(int[] arr, int target, int pos) {
        Map<Integer, ListNode> cache = new HashMap<>();
        ListNode node = null;
        ListNode temp = null;
        ListNode curr = null;
        for (int value : arr) {
            curr = new ListNode(value);
            if (node == null) {
                node = curr;
                temp = curr;
            } else {
                temp.next = curr;
                temp = temp.next;
            }
            cache.put(value, curr);
        }
        ListNode listNode = cache.get(target);
        if (listNode != null) {
            listNode.next = cache.get(pos);
        }
        return node;
    }

    public static List<Integer> extractListNode(ListNode node) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = node;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return list;
    }
}
