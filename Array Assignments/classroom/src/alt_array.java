import java.util.Arrays;

public class alt_array {
    public static void main(String[] args){
        int[] a1 = {1,3,5,7};

        int[] a2 = {2,4,6,8};

        int n1=a1.length, n2 = a2.length, n3=n1+n2;

        int[] a3 = new int[n3];

        for(int i=0,j=0;i<n3;i+=2,j++){
           a3[i]=a1[j];
           a3[i+1]=a2[j];
        }
        System.out.println(Arrays.toString(a3));
    }
}
// time complexity: O(n)
// space complexity: O(n)
