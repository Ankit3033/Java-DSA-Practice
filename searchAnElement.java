package LinkedList;

public class searchAnElement {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next =null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head =newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public int search(int find){
        int index =0;
        Node currNode = head;

        while(currNode !=null){
            if(currNode.data == find){
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }



    public static void main(String[] args) {

        searchAnElement list = new searchAnElement();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        int find =4;
        int result = list.search(find);
        if(result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }
    }
}
