class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
public class Add_two_numbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
        sum+=carry;
        carry=sum/10;
        ListNode newNode=new ListNode(sum%10);
        temp.next=newNode;
        temp=temp.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Second number: 465
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Add_two_numbers obj = new Add_two_numbers();

        ListNode result = obj.addTwoNumbers(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    
    }
}
