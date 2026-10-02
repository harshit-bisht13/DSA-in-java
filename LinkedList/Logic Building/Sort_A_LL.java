class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class Sort_A_LL {
    // Function to sort the linked list by relinking nodes.
    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node zeroDummy = new Node(0);
        Node oneDummy = new Node(0);
        Node twoDummy = new Node(0);

        Node zeroTail = zeroDummy;
        Node oneTail = oneDummy;
        Node twoTail = twoDummy;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = null;

            if (current.data == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            } else if (current.data == 1) {
                oneTail.next = current;
                oneTail = oneTail.next;
            } else {
                twoTail.next = current;
                twoTail = twoTail.next;
            }

            current = nextNode;
        }

        zeroTail.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        oneTail.next = twoDummy.next;

        if (zeroDummy.next != null) {
            return zeroDummy.next;
        }
        if (oneDummy.next != null) {
            return oneDummy.next;
        }
        return twoDummy.next;
    }

    static Node buildList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 2, 0, 1};
        Node head = buildList(arr);

        Sort_A_LL sol = new Sort_A_LL();
        head = sol.sortList(head);

        printList(head);
    }
}
