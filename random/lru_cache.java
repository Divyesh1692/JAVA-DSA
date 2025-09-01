import java.util.Arrays;
import java.util.LinkedList;

public class lru_cache {

    public static void main(String[] args) {
        lCache l = new lCache();
        l.capacity(3);

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.print();
    }

}

class lCache {


    LinkedList<Integer> list = new LinkedList<>();
    int capacity=3;

    public void capacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(int a){
        list.addLast(a);

        if(list.size()>3){
            list.removeFirst();
        }
    }

    public void print(){
        System.out.println(Arrays.toString(list.toArray()));
    }
}