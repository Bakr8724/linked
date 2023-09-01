public class linked {
    private Node head;
    private int size;
    private class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    //constructor
    public linked(){
        this.head = new Node(0);
    }

    //return the size of the linked list
    public int size(){
        return size;
    }
    //print the linked list
    public void printList(){
        Node current = head.next;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //test if a  value x is contained in the linked list
    public boolean test( int x){
        Node current = head.next;
        while(current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //add a value x if it is not already contained in the linked list
    public void add(int x){
        Node current = head.next; //start after the header node
        Node prior = head; //keeping track of where the head node is
        while(current != null && current.data < x ){
            prior = current;
            current = current.next;
        }
        if(current == null || current.data != x){ //checks if the current node's value is not equal to x
            Node newNode = new Node(x);
            newNode.next = current;
            prior.next = newNode;
            size++;
        }
        
    }
    //remove a value x if it is contained in the linked list
    public void remove(int x){
        Node current = head.next;
        Node prior = head;
        while(current != null && current.data !=x){
            prior = current;
            current = current.next;
        }
        if(current != null){
            prior.next = current.next;
        }
        size--;
    }
    public static void main(String[] args) {
        linked list = new linked();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(7);
        list.printList();
        System.out.println(list.size());

    }

}