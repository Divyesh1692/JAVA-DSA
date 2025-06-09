import java.util.Arrays;

public class odd_even_Array_Store {
    public static void main(String[] args){
        int[] a1 = {2,5,8,7,3,1,12};
        int n = a1.length;
        int[] a2 = new int[n];
        int count=0;

        for(int i=0; i<n;i++){
            if(a1[i]%2!=0) {
                a2[count] = a1[i];
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(a1[i]%2==0){
                a2[count]=a1[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(a2));
    }
}
// time complexity: O(n)
// space complexity: O(n)

