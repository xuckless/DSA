public class LinkedListMerge {
  int val;
  LinkedListMerge next;
  LinkedListMerge() {}
  LinkedListMerge(int val) { this.val = val; }
  LinkedListMerge(int val, LinkedListMerge next) { this.val = val; this.next = next;}
  
  public LinkedListMerge mergeTwoLists(LinkedListMerge list1, LinkedListMerge list2) {
    LinkedListMerge stub = new LinkedListMerge(0);
    LinkedListMerge current = stub;
    
    while (list1 != null && list2 != null){
      if (list1.val < list2.val){
        current.next = list1;
        list1 = list1.next;
      }
      else if (list2.val <= list1.val){
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }
    if (list1 != null && list2 == null){
      current.next = list1;
    }
    else if (list2 != null && list1 == null){
      current.next = list2;
    }
    return stub.next;
  }
}
