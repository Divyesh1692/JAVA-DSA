import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args){
        int[] a1 = {2,8,10,9,6,5};
        int n = a1.length;
       int k=0;

//        for(int i=0; i<n/2;i++){
//            k=a1[i];
//            a1[i]=a1[n-1-i];
//            a1[n-1-i]=k;
//        }

        int i=0,j=n-1;
        while(i<n/2){
            k=a1[i];
            a1[i]=a1[j];
            a1[j]=k;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(a1));
    }
}
// time complexity: O(n)
// space complexity: O(n)

