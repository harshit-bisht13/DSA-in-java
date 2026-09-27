class ListNode {
    int data;
    ListNode next;

    ListNode(int value) {
        this.data = value;
        this.next = null;
    }
}
public class Search_in_LL {
    static class Solution {
        public boolean searchKey(ListNode head, int key) {
            ListNode temp = head;

            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }

            return false;
        }
    }

    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        Solution obj = new Solution();

        System.out.println(obj.searchKey(head, 30)); // true
        System.out.println(obj.searchKey(head, 50)); // false
    }    
}
