package LinkedList;

public class reverseLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next = null;
        }

    }

    public static Node reverse(Node head){
        Node prev =null;
        Node curr = head;
        Node next =null;

        while(curr!=null){
            next = curr.next;
            curr.next =prev;
            prev =curr;
            curr = next;
        }
        return prev;
    }

    public static void printList(Node head){
        if(head ==null){
            System.out.println("null");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        reverseLinkedList list = new reverseLinkedList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original: ");
        printList(head);

        head =reverse(head);
        System.out.print("\nReversed: ");
        printList(head);
    }
}
