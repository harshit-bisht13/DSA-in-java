

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data=data;
        this.next=null;
    }
    public ListNode(int data,ListNode next){
        this.data=data;
        this.next=next;
    }
    
}
public class Traversal_In_LinkedList {
    public static void traversal(ListNode head){
        ListNode temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        
        traversal(head);
    }
}
