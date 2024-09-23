public class PriorityQueue {
    class Node {
        int priority, data;
        Node next;

        Node(int priority, int data) {

        }

    }

    Node head;boolean(Empty()){
        return head == null;
    }

    void add (int priority,int data){
        Node node = new Node(priority, data);
        if(isEmpty()){
            head = node;
        }else if(priority<head.priority){
            node.next = head;
            head = node
        }else{
            Node pointer = head;
            while (pointer.next! = null && priority>pointer.priority) {
                pointer = point.next;
                
            }
            pointer.next = node;
        }
        }

    void poll() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
