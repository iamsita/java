import org.w3c.dom.Node;

public class Queuelinklist {
    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Nothing to dequeue");

2. **Build a registration form for an event**: Use HTML forms to create fields for name, email, phone number, and other relevant information. Use CSS for styling the form, including customizing the appearance of input fields, buttons, and error messages. Use JavaScript for form validation and to enhance user experience.            head = head.next;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Nothing");

        } else {
            System.out.println(head.data);
        }
    }

    void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queuelinklist queue = new Queuelinklist();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.peek();
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
    }
}