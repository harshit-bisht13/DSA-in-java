class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class Find_the_intersection_point_of_Y_LL {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != tempB) {

            if (tempA == null) {
                tempA = headB;
            } else {
                tempA = tempA.next;
            }

            if (tempB == null) {
                tempB = headA;
            } else {
                tempB = tempB.next;
            }
        }

        return tempA;
    }

    public static void main(String[] args) {

        // Common part:
        // 7 -> 8

        ListNode common = new ListNode(7);
        common.next = new ListNode(8);

        // List A:
        // 1 -> 2 -> 3 -> 7 -> 8
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = common;

        // List B:
        // 4 -> 5 -> 7 -> 8
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}