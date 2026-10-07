import java.util.Stack;

public class Reverse_a_stack{

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = st.pop();

        // Reverse the remaining stack
        reverseStack(st);

        // Put the removed element at the bottom
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }

        // Remove top temporarily
        int top = st.pop();

        // Insert value at bottom
        insertAtBottom(st, value);

        // Put the removed element back
        st.push(top);
    }

    public static void printStack(Stack<Integer> st) {
        System.out.println(st);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack:");
        printStack(st);

        reverseStack(st);

        System.out.println("Reversed Stack:");
        printStack(st);
    }
}