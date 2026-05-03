package LinkedList;

public class DetectLoopInLL {

    Node head;
    class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =null;
        }
    }

    public boolean detectLoop(){

        Node slow =head;
        Node fast = head;

        while(fast!=null && fast.next !=null){

            slow =slow.next;
            fast =fast.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        DetectLoopInLL list = new DetectLoopInLL();

        list.head = list.new Node(1);
        Node second = list.new Node(2);
        Node third =list.new Node(3);
        Node fourth = list.new Node(4);

        list.head.next =second;
        second.next =third;
        third.next =fourth;

        fourth.next =second;

        if(list.detectLoop()){
            System.out.println("Loop Hai");
        }else{
            System.out.println("Loop nahi hai");
        }
    }
}
