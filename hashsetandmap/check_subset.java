import java.util.HashSet;

public class check_subset {
    public static void main(String[] args) {
       int [] arr1 = {1,2,3,4,5,6};
       int [] arr2 = {2,4,5,7};

       if(isSubset(arr1,arr2)){
           System.out.println("arr2 is subset of arr1");
       }else{
           System.out.println("arr2 is NOT subset of arr1");
       }
    }

    private static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr1){
            set.add(ele);
        }

        for(int ele:arr2){
            if(!set.contains(ele)){
                return false;
            }
        }

        return true;
    }
}
