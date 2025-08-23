public class circularLL {
    public static void main(String[] args) {
        circularLinkList cll = new circularLinkList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        System.out.println("Before Swap:");
        cll.print();

        cll.swapFirstAndLast();

        System.out.println("Is Circular? " + cll.isCirculer());


        System.out.println("After Swap:");
        cll.print();

    }

}

class circularLinkList{

    Node head;

    public void insert(int data){
        Node nn = new Node(data);
        if(head==null){
            head=nn;
            head.next=head;
        }else{
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = nn;
            nn.next=head;
        }
    }

    public void print(){
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println();
    }

    public boolean isCirculer(){
        if(head == null){
            return true;
        }

        Node temp = head;

        while (temp != null && temp != head){
            temp = temp.next;
        }

        return (temp == head);
    }

    public void swapFirstAndLast() {
     if(head == null || head.next == head){
         return;
     }
     Node prev = null;
     Node last = head;

     while (last.next != head){
         prev = last;
         last = last.next;
     }

     prev.next = head;
     Node temp = head.next;
     last.next = temp;
     head.next = last;
     head  = last;

    }

}

