import java.util.HashMap;
import java.util.Map;


public class mostFreqEle {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int maxFreq = 0;
        int maxEle =-1;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq =  e.getValue();
                maxEle = e.getKey();
            }
        }

        System.out.println("Most Freq Ele: "+maxEle+", Freq: "+maxFreq);
    }
}
