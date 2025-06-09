import java.util.Arrays;

public class print_double_array {
    public static void main(String[] args){
        int[] a1 = {1,5,9,10};
        int n1 = a1.length;
        int[] a2 = new int[n1*2];

        for(int i=0;i<n1;i++){
            a2[i]=a2[n1+i]=a1[i];
        }
//        for(int i=0;i<n1;i++){
//            a2[n1+i]=a1[i];
//        }
        System.out.println(Arrays.toString(a2));
    }
}
// time complexity: O(n)
// space complexity: O(n)   


