import java.util.Arrays;

public class max_ele {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,2,4,9};
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i]>second && arr[i]!= first) {
                third = second;
                second = arr[i];
            } else if (arr[i]>third && arr[i]!=second) {
                third = arr[i];
            }
        }
        System.out.println(first + " \n"+second+"\n"+third);
    }
}
// time complexity: O(n)
// space complexity: O(1)
