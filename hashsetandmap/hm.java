import java.util.ArrayList;
import java.util.Objects;

public class hm {

    public static void main(String[] args) {
        HashMap2 hashMap = new HashMap2();
        hashMap.put(1, "1111");
        hashMap.put(2, "2222");
        hashMap.put(3, "3333");
        hashMap.put(1, "4444");


        hashMap.put(4, "4444");
        hashMap.put(5, "5555");
        hashMap.put(6, "6666");
        hashMap.put(7, "7777");

        hashMap.put(8, "8888");
        hashMap.put(9, "9999");
    }
}

class HashMap2{
    ArrayList<LinkedList> linkedLists = new ArrayList<>();
    int capacity;
    int size;
    float loadFactor = 0.75f;
    HashMap2(){
        this.capacity = 2; // start small to trigger rehash quickly
        this.size = 0;
        for (int i=0; i<capacity; i++){
            linkedLists.add(new LinkedList());
        }
    }
    private int getBucketIndex(int k) {
        return Math.abs(Objects.hashCode(k)) % capacity;
    }
    public void put(int k, String v){
        Node nn = new Node(k, v);
        int i = getBucketIndex(k);
        LinkedList bucket = linkedLists.get(i);

        Node current = bucket.head;
        while(current !=null){
          if(current.key == k){
             current.value=v;
             return;
         }
         current=current.next;
        }

       if(bucket.head == null){
           bucket.head=nn;
           bucket.tail=nn;
       }else{
           bucket.tail.next = nn;
           bucket.tail=nn;
       }

       size++;

       if((1.0*size/capacity)>loadFactor){
           rehash();
       }
    }

    private void rehash() {
        System.out.println("rehashing started, old capacity: "+capacity);
        ArrayList<LinkedList> oldBuckets = linkedLists;
        capacity = 2*capacity;
        linkedLists = new ArrayList<>();
        for(int i=0; i<capacity;i++){
            linkedLists.add(new LinkedList());
        }

        size=0;

        for(LinkedList b : oldBuckets){
            Node temp = b.head;
            while (temp != null) {
                put(temp.key,temp.value);
                temp=temp.next;
            }
        }

        System.out.println("rehashing done, new capacity: "+capacity);

    }

    public void get(int k){
    int x =getBucketIndex(k);
    LinkedList bucket = linkedLists.get(x);

    Node current = bucket.head;
    while (current!=null){
        if(current.key==k){
            System.out.println(current.value);
            return;
        }
        current=current.next;
    }
        System.out.println("Not Found");
    return;
    }
}

class LinkedList{
    Node head, tail;

}

class Node{
    int key;
    String value;
    int hashCode;
    Node next;

    public Node(int k, String v) {
        this.key = k;
        this.value = v;
    }
}