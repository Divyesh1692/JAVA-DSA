import java.util.HashMap;
import java.util.Map;

public class count_freq {
    public static void main(String[] args) {
        int [] arr = {2,4,5,1,2,6,8,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+ " " + e.getValue() );
        }

    }
}
