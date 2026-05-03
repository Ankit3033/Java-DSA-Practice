package LinkedList;

public class checkPalindromeLL {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next =null;
        }
    }

    public static boolean isPalindrome(Node head){

        if(head==null || head.next==null)return true;

        Node slow = head;
        Node fast =head;

        while(fast !=null && fast.next!=null){
            slow =slow.next;
            fast =fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while(secondHalf!=null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static Node reverse(Node head){

        Node prev =null;
        Node curr =head;

        while(curr !=null){
            Node temp = curr.next;
            curr.next = prev;
            prev =curr;
            curr = temp;
        }
        return prev;
    }

    public static void printList(Node head){
        Node temp =head;
        while(temp !=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Orignal List: ");
        printList(head);

        head = reverse(head);
        System.out.println("Reversed List: ");
        printList(head);

        System.out.println("Is list is Palindrome: " + isPalindrome(head));
    }
}
