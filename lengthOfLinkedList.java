package LinkedList;

public class lengthOfLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head ==null){
                head =newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next !=null){
                currNode =currNode.next;
            }
            currNode.next =newNode;
        }


         int length(Node head){

            if(head ==null){
                System.out.println("null");
            }

            int count=0;
            Node currNode =head;
            while(currNode !=null){
                count++;
                currNode = currNode.next;
            }
            return count;
        }

    public static void main(String[] args) {
        lengthOfLinkedList list = new lengthOfLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        System.out.println("Length: " + list.length(list.head));
    }
}
