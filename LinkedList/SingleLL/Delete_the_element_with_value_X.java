class ListNode{
    public int data;
    public ListNode next;
    ListNode() { 
        data = 0; 
        next = null; }
    ListNode(int x) { 
        data = x; 
        next = null; }
    ListNode(int x, ListNode next) { 
        data = x; 
        this.next = next; 
    }
}
public class Delete_the_element_with_value_X {

    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head==null){
            return null;
        }
        if(head.data==X){
            return head.next;
        }
        ListNode temp=head;
        while(temp.next!=null && temp.next.data!=X){
            temp=temp.next;
        }
        if(temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static void main(String[] args) {
         ListNode head = new ListNode(10);
    head.next = new ListNode(20);
    head.next.next = new ListNode(30);
    head.next.next.next = new ListNode(40);
    head.next.next.next.next = new ListNode(50);

    // Value to delete
    int X = 30;

    // Create object of class
    Delete_the_element_with_value_X obj = new Delete_the_element_with_value_X();

    // Delete node
    head = obj.deleteNodeWithValueX(head, X);

    // Print linked list
    ListNode temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
    }
}
