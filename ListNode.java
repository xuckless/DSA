public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next;}
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode stub = new ListNode(0);
    
    while (l1 != null && l2 != null) {
      stub.next.val = l1.val + l2.val;
      stub = stub.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    return stub.next;
  }
}
