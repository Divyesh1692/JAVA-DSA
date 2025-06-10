import java.util.Arrays;

public class small_ele_count {
    public static void main(String[] args){
        int[] a1 = {5,10,14,3,9,6};
        int n = a1.length;
       int count;

        for(int i=0; i<n;i++){
           count=0;
           for(int j=0;j<n;j++){
               if(a1[j]<a1[i]){
                   count++;
               }
           }
            System.out.print(count+" ");
        }
    }
}
// time complexity: O(n^2)
// space complexity: O(n)

