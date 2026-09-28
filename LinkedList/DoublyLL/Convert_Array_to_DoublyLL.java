
import java.util.*;

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
public class Convert_Array_to_DoublyLL{
    public ListNode arrayToDoublyLinkedList(List<Integer> arr){
        if(arr.size()==0){
            return null;
        }
        ListNode head=new ListNode(arr.get(0));
        ListNode prev=head;
        for(int i=1;i<arr.size();i++){
            ListNode current=new ListNode(arr.get(i));
            current.prev=prev;
            prev.next=current;
            prev=current;
        }
        return head;
    }
    public static void main(String[] args) {
        Convert_Array_to_DoublyLL obj = new Convert_Array_to_DoublyLL();

        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50);

        ListNode head = obj.arrayToDoublyLinkedList(arr);

        // Forward traversal
        System.out.println("Forward:");

        ListNode temp = head;
        ListNode tail = null;

        while (temp != null) {
            System.out.print(temp.data + " ");
            tail = temp;
            temp = temp.next;
        }

        // Backward traversal
        System.out.println("\nBackward:");

        temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
