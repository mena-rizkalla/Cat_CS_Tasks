package LinkedListTask2;

public class RotateList {
    //slow and fast pointer

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;

        ListNode current = head;
        int size = 0 ;
        while (current != null){
            current = current.next;
            size++;
        }

        for (int i = 0; i < k%size; i++) {
            fast = fast.next;
        }

        while (fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;

    }
}
