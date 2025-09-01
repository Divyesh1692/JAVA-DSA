import java.util.HashSet;

public class print_distinct {
    public static void main(String[] args) {
    int [] arr = {2,4,5,1,2,6,8,4};

        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }

        for (int ele:set){
            System.out.print(ele+" ");
        }

    }
}
