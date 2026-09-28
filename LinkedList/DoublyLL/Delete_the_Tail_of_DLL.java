class ListNode{
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(int data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public ListNode(int data,ListNode next,ListNode prev){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
}
public class Delete_the_Tail_of_DLL {
    public ListNode deleteTail(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.prev.next=null;
        tail.prev=null;
        return head;
    }
    public static void main(String[] args) {

    // Create DLL
    ListNode head = new ListNode(10);
    ListNode second = new ListNode(20);
    ListNode third = new ListNode(30);
    ListNode fourth = new ListNode(40);

    head.next = second;
    second.prev = head;

    second.next = third;
    third.prev = second;

    third.next = fourth;
    fourth.prev = third;

    Delete_the_Tail_of_DLL obj = new Delete_the_Tail_of_DLL();

    // Print before deletion
    System.out.println("Before deletion:");

    ListNode temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    // Delete tail
    head = obj.deleteTail(head);

    // Print after deletion
    System.out.println("\nAfter deletion:");

    temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
}
