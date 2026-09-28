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
public class Delete_the_kth_element {
    public ListNode deleteKthElement(ListNode head, int k) {
        // Your code goes here
        if(head==null){
            return null;
        }
        ListNode temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
            if(temp==null){
                return head;
            }
        }
        if(temp.prev==null){
            head=temp.next;
        if(head!=null){
            head.prev=null;
        }
        return head;
    }
        if (temp.next == null) {
            temp.prev.next=null;
            temp.prev=null;
            return head;
        }
                    
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        temp.prev = null;
        temp.next = null;

        return head;

    }
    public static void main(String[] args) {

    // Create DLL: 10 ⇄ 20 ⇄ 30 ⇄ 40 ⇄ 50
    ListNode head = new ListNode(10);

    ListNode second = new ListNode(20);
    ListNode third = new ListNode(30);
    ListNode fourth = new ListNode(40);
    ListNode fifth = new ListNode(50);

    head.next = second;
    second.prev = head;

    second.next = third;
    third.prev = second;

    third.next = fourth;
    fourth.prev = third;

    fourth.next = fifth;
    fifth.prev = fourth;

    // Print original list
    System.out.println("Before deletion:");

    ListNode temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    // Delete kth element
    Delete_the_kth_element obj = new Delete_the_kth_element();

    int k = 3;
    head = obj.deleteKthElement(head, k);

    // Print after deletion
    System.out.println("\nAfter deleting " + k + "rd element:");

    temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
}
