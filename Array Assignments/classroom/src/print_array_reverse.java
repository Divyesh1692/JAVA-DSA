public class print_array_reverse {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
// time complexity: O(n)
// space complexity: O(n)
