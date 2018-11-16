/**
 * Created by hasee on 2018/11/15.
 */
public class reverse_Linked_List {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode node1,node2;
        node1 = head.next;
        node2 = head.next.next;
        head.next = null;
        while (node1.next!=null){
            node1.next= head;
            head = node1;
            node1 = node2;
            node2 = node2.next;
        }
        node1.next = head;
        return node1;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(3);
        node.next = new ListNode(4);
        node.next.next = new ListNode(5);
        node.next.next.next = new ListNode(6);
        reverse_Linked_List reverse_linked_list = new reverse_Linked_List();
        reverse_linked_list.reverseList(node);
    }
}
