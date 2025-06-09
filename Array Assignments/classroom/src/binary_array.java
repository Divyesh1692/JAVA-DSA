import java.util.Arrays;

public class binary_array {
    public static void main(String[] args){
       int [] arr = {1,0,1,0,1,1,0,0,1};
       int n = arr.length, count=0;
       for(int i=0; i<n; i++){
           if(arr[i]==0){
                count++;
           }
       }
       for(int i=0; i<n; i++){
           if(i<count){
               arr[i]=0;
           }else{
               arr[i]=1;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
// time complexity: O(n)
// space complexity: O(n)
