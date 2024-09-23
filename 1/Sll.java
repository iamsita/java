public class Sll {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    private void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    private void insertAtTail(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = node;
        }
    }

    private void insertAtIndex(int data, int index){
        if(index == 0){
            insertAtStart(data);
        }
        else{
            Node node = new Node(data);
            Node current = head, previous = null;
            int i = 0;
            while(i < index && current != null){
                previous = current;
                current = current.next;
                i++;
            }
            if(current == null){
                System.out.println("Index out of bound.");
            }
            else{
                node.next = current;
                previous.next = node;
            }
        }
    }

    private void printList(){
        Node pointer = head;
        while(pointer != null){
            System.out.println(pointer.data + " ");
            pointer = pointer.next;
        }
    }

    public static void main(String[] arg) {
        Sll list = new Sll(); 
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtTail(30);
        list.printList();
        list.insertAtIndex(40, 2);
    }
}