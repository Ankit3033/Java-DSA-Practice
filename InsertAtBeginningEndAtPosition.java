package LinkedList;

public class InsertAtBeginningEndAtPosition {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head =newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node secondLast =head;
        Node last = head.next;
        while(last.next !=null){
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next =null;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtBeginningEndAtPosition list = new InsertAtBeginningEndAtPosition();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.printList();

        list.addLast(50);
        list.printList();
    }
}
