import java.util.Arrays;

public class odd_even_sort_array {
    public static void main(String[] args){
       int [] arr = {2,3,5,4,7,9,10,12};
       int n = arr.length,temp=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { // if odd
                temp = arr[i];
                int j = i;
                // Shift all even numbers before i to the right
                while (j > 0 && arr[j - 1] % 2 == 0) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
// time complexity: O(n2)
// space complexity: O(n)
