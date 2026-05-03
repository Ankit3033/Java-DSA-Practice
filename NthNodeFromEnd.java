package LinkedList;

public class NthNodeFromEnd {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next=null;
        }
    }

    public static Node NthNode(Node head ,int n){

        Node slow = head;
        Node fast = head;

        for(int i=0; i<n;i++){
            fast = fast.next;
        }

        while(fast !=null){
            slow =slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void printList(Node head){
        if(head ==null){
            System.out.println("List is empty");
        }

        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next =new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("List is: ");
        printList(head);

        int n=3;
        Node result = NthNode(head,n);
        System.out.println("Nth node from end is: " + result.data);
    }
}
