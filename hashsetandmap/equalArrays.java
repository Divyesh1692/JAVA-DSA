import java.util.HashMap;

public class equalArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 5, 4};

        if (arr1.length != arr2.length) {
            System.out.println("Not Equal");
            return;
        }

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int n : arr1){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        for(int n :arr2){
            if (!freq.containsKey(n)){
                System.out.println("Not Equal");
                return;
            }
            freq.put(n,freq.get(n)-1);
            if(freq.get(n)==0){
                freq.remove(n);
            }
        }
        if(freq.isEmpty()){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
