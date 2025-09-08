package LeetCode;
// Reverse Linked List

public class LeetCode206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    public static void printLinkeList(ListNode head){
        if (head == null){
            System.out.println("List is empty!");
        }
        else {
            ListNode tmp = head;
            while (tmp != null) {
                System.out.println(tmp.val);
                tmp = tmp.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        ListNode n4 = reverseList(n1);
        printLinkeList(n4);
    }
}
