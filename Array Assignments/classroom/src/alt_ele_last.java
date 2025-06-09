public class alt_ele_last {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        for(int i=arr.length-1;i>=0;i-=2){
            System.out.print(arr[i]);
        }
    }
}
// time complexity: O(n)
// space complexity: O(1)

