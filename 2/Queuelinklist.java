public class Queuelinklist{
    void enqueue(int data){
        Node next ;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head,tail;
    public boolean isEmpty(){
        return head == null;
    }
    void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Nothing to dequeue");
        }else{
            head = head.next;
        }class Queuelinklist
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Nothing to peek");
    }else{
        System.out.println(head.data);
    }
    }
    void print(){
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
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