import java.util.HashSet;

public class print_unique {
    public static void main(String[] args) {
    int [] arr = {2,4,5,1,2,6,8,4};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dupli = new HashSet<>();
        for (int i=0; i<arr.length;i++){
            if(set.contains(arr[i])){
                dupli.add(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }

        for (int i=0; i<arr.length;i++){
            if(!dupli.contains(arr[i]))
            System.out.print(arr[i]+" ");
        }

    }
}
