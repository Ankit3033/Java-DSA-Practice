package LinkedList;

public class removeDuplicatesLL {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next =null;
        }
    }

    public static Node removeDuplicates(Node head){

        Node current = head;

        while(current != null && current.next !=null){
            if(current.data ==current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(Node head){
        Node curr =head;

        while(curr!=null){
            System.out.print(curr.data + "-->");
            curr =curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(1);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(3);
        head1.next.next.next.next.next = new Node(4);

        System.out.println("Sorted List: ");
        printList(head1);

        head1 = removeDuplicates(head1);
        System.out.println("After Removing Duplicates: ");
        printList(head1);
    }
}
