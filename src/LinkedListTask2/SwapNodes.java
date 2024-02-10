package LinkedListTask2;

public class SwapNodes {
    public  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public  ListNode swapPairs(ListNode head) {

       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode current = dummy.next;

       while (current.next != null && current.next.next != null){

           ListNode first = current.next;
           ListNode second = current.next.next;

           current.next  = second;
           first.next = second.next;
           second.next = first;
           current = current.next.next;
       }

       return dummy.next;

    }



}
