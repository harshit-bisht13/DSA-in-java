class Node{
      int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}
public class Remove_nth_Node_from_the_end {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode fast=temp;
        ListNode slow=temp;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return temp.next;
    }
    public static void main(String[] args) {

        // 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        Remove_nth_Node_from_the_end obj = new Remove_nth_Node_from_the_end();

        head = obj.removeNthFromEnd(head, n);

        // Print linked list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }
    }
}
