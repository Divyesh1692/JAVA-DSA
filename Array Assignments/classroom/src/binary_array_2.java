import java.util.Arrays;

public class binary_array_2 {
    public static void main(String[] args){
       int [] arr = {0,1,0,1,0,1,1,0,0,0,1};
       int n = arr.length, count=0;
       for(int i=0; i<n; i++){
           if(arr[i]==0){
               arr[i]=1;
               arr[count]=0;
                count++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
// time complexity: O(n)
// space complexity: O(n)
