public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1 == null? list2:list1;
        return dummy.next;
    }

    public static void main(String args[]) {
        ListNode ln = new ListNode();
        String s = "a";
    }
}
