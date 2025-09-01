import java.util.LinkedList;
import java.util.Map;

public class internalWorking {


}

class customHashMap<K,V>{


    static class entry<K,V>{
        K key;
        V value;
        entry<K,V> next;

        entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;

        }
    }

    private entry<K,V> [] buckets;
    private int capacity;
    private int size;
    private float loadFactor;

    public customHashMap(int initialCapacity, float loadFactor) {
        this.capacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.buckets = new entry[capacity];
        this.size=0;
    }
    public customHashMap() {
        this(4, 0.75f); // default capacity=4
    }

    private int getBucketIndex(K key){
        return Math.abs(key.hashCode()) % capacity;
    }


    public void put(K key, V value){
        int index = getBucketIndex(key);
        entry<K,V> head = buckets[index];

        while (head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        entry<K,V> newNode = new entry<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        if(size/capacity > loadFactor){
            rehash();
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        entry<K, V> head = buckets[index];
        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }


    private void rehash() {
        System.out.println("⚡ Rehashing triggered! Old capacity: " + capacity + ", size: " + size);
        entry<K,V>[] oldBuckets = buckets;

        capacity = 2* capacity;
        buckets = new entry[capacity];
        size=0;

        for(entry<K,V> headNode : oldBuckets){
            while (headNode !=null){
                put(headNode.key,headNode.value);
                headNode = headNode.next;
            }
        }
        System.out.println("✅ Rehashing done. New capacity: " + capacity);
    }
}