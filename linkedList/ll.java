import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ll {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(20);
        linkedList.insert(20);

        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);

        linkedList.print();

        linkedList.removeDuplicates();
        linkedList.print();
        linkedList.reverse();
//        linkedList.update(20, 200);
        linkedList.print();
//        linkedList.find(20);
//        linkedList.delete(200);
        linkedList.print();

//        LinkedList.deleteNode(linkedList.head.next);

        linkedList.print();
        System.out.println(" -------------------- ");
        linkedList.printMiddle();

        linkedList.tail.next = linkedList.head.next.next;


        System.out.println(linkedList.isLoop());

        System.out.println(linkedList.loopLength());


    }
}

class LinkedList{
    Node head, tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null){
            head = tail = nn;
        }else {
            tail.next = nn;
            tail = nn;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void update(int oldV, int newV) {
        Node temp = head;
        while (temp != null){
            if (temp.data == oldV){
                temp.data = newV;
            }
            temp = temp.next;
        }
    }

    public void find(int data) {
        Node temp = head;
        while (temp != null){
            if (temp.data == data){
                System.out.println("present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not present");
    }


    public void delete(int data){
        if(head==null){
            System.out.println("Empty LL");
            return;
        }

        if(head.data==data){
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            System.out.println( data+" Deleted");
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            if(curr.data==data){
                if(curr==tail){
                    tail=prev;
                    tail.next=null;
                }else{
                    prev.next = curr.next;
                }
                System.out.println(data+ " Deleted");
                return;
            }

            prev = curr;
            curr = curr.next;
        }
        System.out.println("Not In List");

    }

    public int nodes(){
        int count =0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void printRevers() {
        Stack<Integer> stk = new Stack<>();
        Node temp = head;
        while (temp != null){
            stk.push(temp.data);
            temp = temp.next;
        }
        while (!stk.isEmpty()){
            System.out.println(stk.pop()+" ");
        }
    }

    public int getNthNode(int i){
        if(head==null){
            System.out.println("Empty LL");
            return -1;
        }
        Node temp = head;
        int count = 0;

        while (temp!=null){
            if(count==i){
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        System.out.println("Index out of range");
        return -1;
    }

    public int getNthNodeFromEnd(int n){
        if(head==null){
            System.out.println("LL Empty");
            return -1;
        }
        Node first = head;
        Node second = head;

        for(int i=0; i<n; i++){
            if(first == null){
                System.out.println("out of range");
                return -1;
            }
            first = first.next;
        }

        while(first!=null){
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    static void deleteNode(Node n){
        if(n==null || n.next== null){
            System.out.println("last node");
            return;
        }
        n.data = n.next.data;
        n.next = n.next.next;

    }

    public void printMiddle(){
        if(head==null){
            System.out.println("LL Empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node is : "+ slow.data);
    }

    public boolean isLoop(){
        if(head==null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("loop Detected");
                return true;
            }
        }

        System.out.println("no loop detected");
        return false;
    }

    public int loopLength(){
        Node slow = head;
        Node fast = head;

        while (slow!= null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return countNodes(slow);
            }
        }

        return 0;
    }

    private int countNodes(Node slow) {
        int count =1;
        Node temp = slow;

        while(temp.next!=slow){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void removeDuplicates(){
        if(head==null){
            return;
        }

        Node curr = head;

        while(curr!=null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        head = prev;
    }

}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}