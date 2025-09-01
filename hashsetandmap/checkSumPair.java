import java.util.HashSet;

public class checkSumPair {
    public static void main(String[] args) {
        int [] arr = {8,4,5,2,3};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();

        for(int n : arr){
            int k = target - n;

            if(set.contains(k)){
                System.out.println("Pair: "+ n+","+k);
                return;
            }
            set.add(n);
        }

        System.out.println("No Pair Found");
    }
}
