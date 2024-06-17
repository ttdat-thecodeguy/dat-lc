package t6;


import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(9);
        a.next = b;
        b.next = c;

        ListNode d = new ListNode(9);
        ListNode e = new ListNode(9);
        d.next = e;


        ListNode result = addTwoNumbers(a, d);
        iterateNode(result);
    }

    public static void iterateNode(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static ListNode solution (ListNode a, ListNode b) {
        ListNode i = a;
        ListNode j = b;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        boolean isIncr=false;
        int val = 0;
        while (i != null || j != null || val != 0) {
            int jVal = (j != null) ? j.val : 0;
            int iVal = (i != null) ? i.val : 0;
            int sum = iVal + jVal + val;
            val = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (i != null) i = i.next;
            if (j != null) j = j.next;
        }
        return result.next;
    }

    public static ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode i = a;
        ListNode j = b;
        ListNode result = null;
        boolean isIncr=false;
        while (i != null) {
            int val = 0;
            int jVal = (j != null) ? j.val : 0;
            int sum = i.val + jVal;
            if (isIncr) {
                sum += 1;
                isIncr = false;
            }
            if (sum >= 10) {
                val = sum % 10;
                isIncr = true;
            } else {
                val = sum;
            }
            result = insert(result, val);
            i=i.next;
            if (j != null) j = j.next;
        }
        if (isIncr) {
            result = insert(result, 1);
        }
        return result;
    }

    public static ListNode insert(ListNode h, int data)
    {
        ListNode new_node = new ListNode(data);
        if (h == null) {
            h = new_node;
        }
        else {
            ListNode last = h;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return h;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
